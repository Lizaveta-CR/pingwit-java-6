package com.pingwit.core.les_22.classwork.point_3;

import java.util.List;

@FunctionalInterface
interface Printer2 {

    void print(Person person);
}

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Masha", "Grishkovet"),
            new Person("ALeh", "Aleh")
        );
        printPersons(people, (p) -> System.out.println(p));
    }

    public static void printPersons(List<Person> people, Printer2 printer) {
        for (Person person : people) {
            printer.print(person);
        }
    }
}

record Person(String name, String surname) {

    public static void printPerson(Person person) {
        System.out.println(person);
    }
}
