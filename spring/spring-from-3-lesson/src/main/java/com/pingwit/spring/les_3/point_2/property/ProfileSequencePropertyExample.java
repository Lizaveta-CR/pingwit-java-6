package com.pingwit.spring.les_3.point_2.property;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
public class ProfileSequencePropertyExample {

    @Value("${my.server.name}")
    private String name;
    @Value("${my.server.nameV2}")
    private String nameV2;

    @PostConstruct
    public void init() {
        System.out.println("server name = " + name);
        System.out.println("server name V2 = " + nameV2);
    }
}
