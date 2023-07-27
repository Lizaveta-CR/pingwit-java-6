package com.pingwit.core.les_22.classwork.point_6;

import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        UnaryOperator<Person4> unaryOperator = (person) -> {
            person.setName("New name");
            return person;
        };
        Person4 original = new Person4("1");
        Person4 apply = unaryOperator.apply(original);
        System.out.println(apply);

        BinaryOperator<Integer> binaryOperator = (val1, val2) -> val1 + val2;
        binaryOperator.apply(4, 5);

        Supplier<Integer> supplier = () -> new Random().nextInt();

        Consumer<Integer> consumer = (val) -> System.out.println(val);

        List<String> names = List.of("Liza", "Masha", "Natasha");
        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(System.out::println);
    }
}

class Person4 {
    private String name;

    public Person4(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person4{" +
            "name='" + name + '\'' +
            '}';
    }
}
