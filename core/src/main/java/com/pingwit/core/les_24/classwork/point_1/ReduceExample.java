package com.pingwit.core.les_24.classwork.point_1;

import com.pingwit.core.les_23.classwork.point_0.Phone;
import java.util.Arrays;
import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer result = numbers.stream()
            .reduce(0, (s1, s2) -> s1 + s2);
//            .reduce(0, Integer::sum);
        System.out.println(result);

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String concat = letters.stream()
            .reduce("", (partialString, element) -> partialString + element);
//            .reduce("", String::concat);
        System.out.println(concat);

        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        Integer reduce = phones.stream()
            .reduce(0, (partialPrice, phone) -> partialPrice + phone.price(), Integer::sum);

        List<String> words = Arrays.asList("aa", "bbs", "cas", "d", "e");
        String concated = words.stream()
            .reduce("", String::concat);
        System.out.println(concated.length());

        int length = words.stream()
            .map(String::length)
            .reduce(0, Integer::sum);
        System.out.println(length);
    }
}
