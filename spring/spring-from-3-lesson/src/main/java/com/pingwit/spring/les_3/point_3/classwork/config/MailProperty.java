package com.pingwit.spring.les_3.point_3.classwork.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@ConfigurationProperties(prefix = "email")
@ConstructorBinding
public class MailProperty {

    private String from;
    private String signature;

    public MailProperty(String from, String signature) {
        this.from = from;
        this.signature = signature;
    }
}
