package simple.java.app;


import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient;
import io.confluent.kafka.schemaregistry.client.SchemaRegistryClient;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializer;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializerConfig;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializer;
import io.specmesh.apiparser.AsyncApiParser;
import io.specmesh.apiparser.model.ApiSpec;
import io.specmesh.kafka.KafkaApiSpec;
import io.specmesh.kafka.Provisioner;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.apache.kafka.common.serialization.LongSerializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.testcontainers.junit.jupiter.Testcontainers;
import specmesh.examples.schema_demo.model.UserInfoOuterClass.UserInfo;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static io.specmesh.kafka.Clients.*;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@Testcontainers
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProtobufSpecFunctionalTest extends AbstractContainerTest {
        public static final int WAIT = 10;
        private static final KafkaApiSpec apiSpec = new KafkaApiSpec(getAPISpecFromResource());

        private AdminClient adminClient;
    private SchemaRegistryClient schemaRegistryClient;

    @BeforeEach
        public void createAllTheThings() {
            System.out.println("createAllTheThings BROKER URL:" + kafkaContainer.getBootstrapServers());
            adminClient = AdminClient.create(getClientProperties());
            schemaRegistryClient = new CachedSchemaRegistryClient(schemaRegistryContainer.getUrl(), 1000);
        }

    @Order(1)
    @Test
    void shouldProvisionProduceAndConsumeProtoWithSpeccyClient() throws Exception {

        Provisioner.provisionTopics(adminClient, apiSpec);
        Provisioner.provisionSchemas(apiSpec, schemaRegistryClient, "./build/resources/test");

        final List<NewTopic> domainTopics = apiSpec.listDomainOwnedTopics();
        final var userInfoTopic = domainTopics.stream().filter(topic -> topic.name().endsWith("_public.user_info"))
                .findFirst().orElseThrow().name();

        /*
         * Produce on the schema
         */
        final KafkaProducer<Long, UserInfo> producer = producer(Long.class, UserInfo.class,
                producerProperties(apiSpec.id(), "do-things-user-info", kafkaContainer.getBootstrapServers(),
                        schemaRegistryContainer.getUrl(), LongSerializer.class, KafkaProtobufSerializer.class, false,
                        Map.of()));
        final var userSam = UserInfo.newBuilder().setFullName("sam fteex").setEmail("hello-sam@bahamas.island")
                .setAge(52).build();

        producer.send(new ProducerRecord<>(userInfoTopic, 1000L, userSam)).get(60, TimeUnit.SECONDS);

        final KafkaConsumer<Long, UserInfo> consumer = consumer(Long.class, UserInfo.class, consumerProperties(
                apiSpec.id(), "do-things-user-info-in", kafkaContainer.getBootstrapServers(),
                schemaRegistryContainer.getUrl(), LongDeserializer.class, KafkaProtobufDeserializer.class, true,
                Map.of(KafkaProtobufDeserializerConfig.SPECIFIC_PROTOBUF_VALUE_TYPE, UserInfo.class.getName())));
        consumer.subscribe(Collections.singleton(userInfoTopic));
        final ConsumerRecords<Long, UserInfo> consumerRecords = consumer.poll(Duration.ofSeconds(10));
        assertThat(consumerRecords, is(notNullValue()));
        assertThat(consumerRecords.count(), is(1));
        assertThat(consumerRecords.iterator().next().value(), is(userSam));
    }



        private static ApiSpec getAPISpecFromResource() {
            try {
                return new AsyncApiParser().loadResource(ProtobufSpecFunctionalTest.class.getClassLoader()
                        .getResourceAsStream("specmesh-examples-schema_demo-api.yaml"));
            } catch (Throwable t) {
                throw new RuntimeException("Failed to load test resource", t);
            }
        }


        private static Properties getClientProperties() {
            final Properties adminClientProperties = new Properties();
            adminClientProperties.put(AdminClientConfig.CLIENT_ID_CONFIG, apiSpec.id());
            adminClientProperties.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaContainer.getBootstrapServers());
            return adminClientProperties;
        }

}
