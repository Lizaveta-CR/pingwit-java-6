package com.pingwit.spring.les_12.classwork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class PrototypeConfiguration {

    @Bean
    @SessionScope
    public MyPrototypeBean myPrototypeBean() {
        return new MyPrototypeBean();
    }
}
