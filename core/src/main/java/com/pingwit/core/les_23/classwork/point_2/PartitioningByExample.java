package com.pingwit.core.les_23.classwork.point_2;

import com.pingwit.core.les_23.classwork.point_0.Phone;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {

    public static void main(String[] args) {
        List<String> strings = List.of("as a the d in and".split("\\s+"));
        Map<Boolean, List<String>> boolLength = strings.stream()
            .collect(Collectors.partitioningBy(str -> str.length() < 2));
        System.out.println(boolLength);

        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        Map<Boolean, List<Phone>> phonesByCompany = phones.stream()
            .collect(Collectors.partitioningBy(phone -> phone.producer().equals("Apple")));
        System.out.println(phonesByCompany);
    }
}
