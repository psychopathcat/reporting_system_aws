package com.antra.evaluation.reporting_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class eurekaSever_7002 {
    public static void main(String[] args) {
        SpringApplication.run(eurekaSever_7002.class, args);
    }
}
