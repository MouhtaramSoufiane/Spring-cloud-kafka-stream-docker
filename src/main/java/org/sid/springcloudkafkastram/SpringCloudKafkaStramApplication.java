package org.sid.springcloudkafkastram;

import org.sid.springcloudkafkastram.entities.PageEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class SpringCloudKafkaStramApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudKafkaStramApplication.class, args);
    }



}
