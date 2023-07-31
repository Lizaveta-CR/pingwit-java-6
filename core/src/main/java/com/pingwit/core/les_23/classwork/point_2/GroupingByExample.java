package com.pingwit.core.les_23.classwork.point_2;

import com.pingwit.core.les_23.classwork.point_0.Phone;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        Map<String, List<Phone>> producerToPhonesMap = phones.stream()
            .collect(Collectors.groupingBy(Phone::producer));

        producerToPhonesMap.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
            System.out.println();
        });

        List<String> strings = List.of("as a the d in and".split("\\s+"));
        Map<Integer, List<String>> lengthToStringsMap = strings.stream()
            .collect(Collectors.groupingBy(String::length));
        System.out.println(lengthToStringsMap);

        int length = strings.stream()
            .collect(Collectors.summingInt(String::length));
        System.out.println(length);
    }
}
