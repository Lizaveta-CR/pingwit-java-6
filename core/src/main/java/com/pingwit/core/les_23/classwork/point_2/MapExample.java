package com.pingwit.core.les_23.classwork.point_2;

import com.pingwit.core.les_23.classwork.point_0.Phone;
import com.pingwit.core.les_23.classwork.point_0.PhoneShorten;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
//            new Phone("8", "Apple", 400),
//            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        Set<String> producers = phones.stream()
            .map(Phone::producer)
            .collect(Collectors.toSet());
        System.out.println(producers);

        List<PhoneShorten> list = phones.stream()
            .filter(phone -> phone.price() > 400)
            .map(phone -> new PhoneShorten(phone.model(), phone.producer()))
            .collect(Collectors.toList());
        System.out.println(list);

        List<String> strings = List.of("aa", "s", "and", "c");
        //[2, 1, 3, 1]
        List<Integer> lengthList = strings.stream()
            .map(String::length)
            .collect(Collectors.toList());
        System.out.println(lengthList);

        Map<String, Phone> producerToPhoneMap = phones.stream()
            .collect(Collectors.toMap(Phone::producer, Function.identity()));

        producerToPhoneMap.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
            System.out.println();
        });
    }
}
