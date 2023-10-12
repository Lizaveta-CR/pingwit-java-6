package com.pingwit.spring.les_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class PingwitApplication {

    public static void main(String[] args) {
        SpringApplication.run(PingwitApplication.class, args);
    }
}
