package com.pingwit.core.les_24.classwork.point_1;

import com.pingwit.core.les_23.classwork.point_0.Phone;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

    public static void main(String[] args) {
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        List<Phone> sorted = phones.stream()
            .sorted(Comparator.comparing(Phone::price).thenComparing(Phone::model))
            .collect(Collectors.toList());

        System.out.println(sorted);

        List<String> words = Arrays.asList("aa", "bbs", "cas", "e", "d");
        words.stream()
            .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
            .forEach(System.out::println);
    }
}
