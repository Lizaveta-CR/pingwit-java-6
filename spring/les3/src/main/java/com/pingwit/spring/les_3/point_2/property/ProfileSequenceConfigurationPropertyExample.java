package com.pingwit.spring.les_3.point_2.property;

import javax.annotation.PostConstruct;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

//@Validated
@ConstructorBinding
@ConfigurationProperties(prefix = "my.server")
public class ProfileSequenceConfigurationPropertyExample {

    @Size(min = 1, max = 5, message = "Name must be beetween lalala 1..5")
    private String name;
    @NotBlank(message = "Name V2 can not be null")
    @Size(min = 1, max = 5, message = "Name must be beetween lalala 1..5")
//    @Pattern(regexp = "^[a-z0-9]]")
    private String nameV2;

    public ProfileSequenceConfigurationPropertyExample(String name, String nameV2) {
        this.name = name;
        this.nameV2 = nameV2;
    }

    @PostConstruct
    public void init() {
        System.out.println("server name from configurationproperties = " + name);
        System.out.println("server name V2 from configurationproperties = " + nameV2);
    }
}
