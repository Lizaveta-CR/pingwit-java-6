package com.pingwit.spring.les_10.classwork.api.controller;

import com.pingwit.spring.les_10.classwork.dto.CoffeeDto;
import com.pingwit.spring.les_10.classwork.service.CoffeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {this.coffeeService = coffeeService;}

    @PostMapping
    public String order(@RequestBody CoffeeDto coffeeDto) {
        return coffeeService.order(coffeeDto);
    }
}
