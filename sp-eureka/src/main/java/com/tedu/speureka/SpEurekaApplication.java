package com.tedu.speureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpEurekaApplication.class, args);
    }

}
