package com.juxbox.farewell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FarewellApplication {

    public static void main(String[] args) {
        SpringApplication.run(FarewellApplication.class, args);
    }
}
