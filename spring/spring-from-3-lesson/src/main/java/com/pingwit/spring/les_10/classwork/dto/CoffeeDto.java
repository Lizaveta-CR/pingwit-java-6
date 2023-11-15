package com.pingwit.spring.les_10.classwork.dto;

import com.pingwit.spring.les_10.classwork.entity.Coffee;

public record CoffeeDto(Coffee coffee, Integer volume, Boolean addSugar) {}
