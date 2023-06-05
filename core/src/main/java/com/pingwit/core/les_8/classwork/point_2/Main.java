package com.pingwit.core.les_8.classwork.point_2;

public class Main {

    public static void main(String[] args) {
        Person masha = new Person("Masha", 33);
        int age = masha.age();
        System.out.println(age);
        String name = masha.name();
        System.out.println(name);
    }
}
