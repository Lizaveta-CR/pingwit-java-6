package com.pingwit.spring.les_10.classwork.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.pingwit.spring.les_10.classwork.entity.Coffee;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CoffeeMachineTest {

    private final CoffeeMachine coffeeMachine = new CoffeeMachine();
    /*
    1. Настраиваете тест. данные - //given
    2. Вызываете тестируемый метод - //when
    3. Проверяете, что возвращаются ожидаемые результаты --then
     */

    @ParameterizedTest
    @MethodSource("makeCoffee_data")
    void makeCoffee(Coffee coffee, Integer volume,  Boolean sugar, String expected) {
        //when
        String actual = coffeeMachine.makeCoffee(coffee, volume, sugar);

        //then
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> makeCoffee_data() {
        return Stream.of(
            Arguments.of(Coffee.CAPPUCINO, 100, true, "100ml CAPPUCINO with sugar"),
            Arguments.of(Coffee.CAPPUCINO, 100, null, "100ml CAPPUCINO with sugar"),
            Arguments.of(Coffee.ESPRESSO, 250, null, "250ml ESPRESSO with sugar")
        );
    }
}
