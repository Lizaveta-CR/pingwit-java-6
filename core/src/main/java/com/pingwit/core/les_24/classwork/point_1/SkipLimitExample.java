package com.pingwit.core.les_24.classwork.point_1;

import com.pingwit.core.les_23.classwork.point_0.Phone;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimitExample {

    public static void main(String[] args) {
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        List<Phone> skipped = phones.stream()
            .skip(2)
            .collect(Collectors.toList());
        System.out.println(skipped);

        List<Phone> limited = phones.stream()
            .limit(2)
            .collect(Collectors.toList());
        System.out.println(limited);

        List<Phone> mix = phones.stream()
            .skip(2)
            .limit(2)
            .collect(Collectors.toList());
        System.out.println(mix);
    }
}
