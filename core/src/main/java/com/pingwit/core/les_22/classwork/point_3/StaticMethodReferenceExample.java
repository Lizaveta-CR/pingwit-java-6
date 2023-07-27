package com.pingwit.core.les_22.classwork.point_3;

import java.util.List;

@FunctionalInterface
interface Printer {

    void print(String name);
}

public class StaticMethodReferenceExample {

    public static void main(String[] args) {
        List<String> names = List.of("John", "Jane", "Alice");
        printNames(names, StaticMethodReferenceExample::printName);
    }

    public static void printNames(List<String> names, Printer printer) {
        for (String name : names) {
            printer.print(name);
        }
    }

    public static void printName(String name) {
        System.out.println(name);
    }
}
