package com.pingwit.spring.les_10.classwork.repository;

import com.pingwit.spring.les_10.classwork.entity.Coffee;
import org.springframework.stereotype.Component;

@Component
public class CoffeeMachine {

    public String makeCoffee(Coffee coffee, Integer volume, Boolean sugar) {
        return volume + "ml" + " " + coffee + " " + getSugar(sugar);
    }

    private String getSugar(Boolean sugar) {
        return sugar == null || sugar ? "with sugar" : "without sugar";
    }
}
