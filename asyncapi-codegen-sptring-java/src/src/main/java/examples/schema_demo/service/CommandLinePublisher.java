package examples.schema_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CommandLinePublisher implements CommandLineRunner {

    @Autowired
    PublisherService publisherService;

    @Override
    public void run(String... args) {
        System.out.println("******* Sending message: *******");
        publisherService.updateLightMeasurement((new Random()).nextInt(), new examples.schema_demo.model.LightMeasuredPayload());
                
        System.out.println("Message sent");
    }
}
