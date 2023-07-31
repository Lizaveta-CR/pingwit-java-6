package com.pingwit.core.les_23.classwork.point_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        String[] arr = new String[] {"aa", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        List<String> list = List.of("aa", "b", "c");
        Stream<String> listStream = list.stream();

        IntStream intStream = IntStream.of(10);
        IntStream intStreamSeveral = IntStream.of(1, 2, 3);

        IntStream range = IntStream.range(1, 5);
        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        IntStream tenNaturalNumbers = IntStream.iterate(1, n -> n + 1).limit(10);
        tenNaturalNumbers.forEach(System.out::println);
    }
}
