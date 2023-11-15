package com.pingwit.spring.les_10.classwork.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.pingwit.spring.les_10.classwork.dto.CoffeeDto;
import com.pingwit.spring.les_10.classwork.entity.Coffee;
import com.pingwit.spring.les_10.classwork.repository.CoffeeMachine;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class CoffeeServiceTest {

    @Mock
    private CoffeeMachine coffeeMachine;
    @InjectMocks
    private CoffeeService coffeeService;

    @Test
    void order() {
        //given
        CoffeeDto dto = new CoffeeDto(Coffee.ESPRESSO, 100, false);
        String coffeeMachineResponse = "100ml ESPRESSO without sugar";
        String expected = "your order is ready: " + coffeeMachineResponse;
        when(coffeeMachine.makeCoffee(Coffee.ESPRESSO, 100, false)).thenReturn(coffeeMachineResponse);

        //when
        String actual = coffeeService.order(dto);

        //then
        assertEquals(expected, actual);
    }
}
