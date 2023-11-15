package com.pingwit.spring.les_10.classwork.service;

import com.pingwit.spring.les_10.classwork.dto.CoffeeDto;
import com.pingwit.spring.les_10.classwork.repository.CoffeeMachine;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {

    private final CoffeeMachine coffeeMachine;

    public CoffeeService(CoffeeMachine coffeeMachine) {this.coffeeMachine = coffeeMachine;}

    public String order(CoffeeDto coffeeDto) {
        return "your order is ready: " + coffeeMachine.makeCoffee(coffeeDto.coffee(), coffeeDto.volume(), coffeeDto.addSugar());
    }
}
