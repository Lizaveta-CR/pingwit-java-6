package com.pingwit.core.les_22.classwork.point_6;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<String> predicate = (val) -> val != null;
        System.out.println(predicate.test("null"));
    }
}
