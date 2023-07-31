package com.pingwit.core.les_23.classwork.point_2;

import com.pingwit.core.les_23.classwork.point_0.Phone;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {
        Set<List<Integer>> lists = new HashSet<>();
        lists.add(List.of(1, 2, 3));
        lists.add(List.of(4, 5, 6));
        lists.add(List.of(7, 8, 9));
        List<Integer> integerList = lists.stream()
            .flatMap(list -> list.stream())
            .filter(x -> x > 4)
            .map(x -> ++x)
            .collect(Collectors.toList());
        System.out.println(integerList);
        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );
    }
}
