package com.pingwit.core.les_24.classwork.point_1;

import com.pingwit.core.les_23.classwork.point_0.Phone;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStreamExample {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        List<Integer> list3 = Arrays.asList(11, 4, 8);

        Stream<Integer> stream1 = list1.stream();
        Stream<Integer> stream2 = list2.stream();
        Stream<Integer> stream3 = list3.stream();
//        Stream<Integer> result = Stream.concat(stream1, stream2);
//        System.out.println(result.collect(Collectors.toList()));

        Stream<Integer> result2 = Stream.concat(Stream.concat(stream1, stream2), stream3);
        System.out.println(result2.collect(Collectors.toList()));

        List<Phone> phones = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        List<Phone> phonesNew = List.of(
            new Phone("Xs", "Apple", 200),
            new Phone("8", "Apple", 400),
            new Phone("S10", "Samsung", 250),
            new Phone("S10", "Samsung", 350),
            new Phone("3310", "Nokia", 1000)
        );

        Stream<Phone> stream = phones.stream();
        Stream<Phone> streamNew = phonesNew.stream();
        List<Phone> collect = Stream.concat(stream, streamNew).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
