package com.qulu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QuluEurekaserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuluEurekaserviceApplication.class, args);
    }
}
