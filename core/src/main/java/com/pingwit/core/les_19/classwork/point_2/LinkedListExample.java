package com.pingwit.core.les_19.classwork.point_2;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        //add elements
        addElements(animals);

        System.out.println(animals.get(1));
        animals.set(2, "Rat");
        System.out.println(animals);
        animals.remove(2);
        animals.remove();
    }

    private static void addElements(LinkedList<String> animals) {
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add(0, "Horse");
        System.out.println(animals);
    }
}
