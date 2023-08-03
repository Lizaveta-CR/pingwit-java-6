package com.pingwit.core.les_24.classwork.point_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 11, 1, 12);
        List<Integer> res = ints.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println(res);

        List<String> words = Arrays.asList("cccc", "as", "cccc", "d", "e");
        List<String> wordsDistinct = words.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println(wordsDistinct);
    }
}
