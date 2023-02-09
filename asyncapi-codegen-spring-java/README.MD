Example of of using: https://github.com/asyncapi/java-spring-template

Prerequisite:
- install npm using `brew install npm`
- run `npm install -g @asyncapi/generator`


Generate using: 
> asyncapi-codegen-java % ag --debug --force-write -o src -p javaPackage=examples.schema_demo ./apispec/demo-api.yaml @asyncapi/java-spring-template

Manual code changes are required.

1. Note: no support for Protobuf or Avro - this would require manual code changes similar to:
 https://objectpartners.com/2022/05/10/kafka-schema-evolution-with-java-spring-boot-and-protobuf/

2. Topics need to meet specmesh structure (i.e. the full topic path needs to be updated)

Look for 
> @KafkaListener(topics = "event.lighting.measured", groupId = "my-group")

Prefix the domain-id "specmesh:examples:schema_demo":

> @KafkaListener(topics = "specmesh.examples.schema_demo.event.lighting.measured", groupId = "my-group")