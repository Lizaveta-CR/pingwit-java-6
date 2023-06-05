package com.pingwit.core.les_8.classwork.point_1;

public class Main {

    public static void main(String[] args) {
        Person pasha = new Person("Pasha", 22);
        Person pasha2 = new Person("Pasha", 22);

        boolean isEqual = pasha == pasha2;
        boolean equals = pasha.equals(pasha2);
        Person pasha3 = new Person("Pasha3", 22);
        System.out.println(isEqual);
        System.out.println(equals);
        System.out.println(pasha.equals(pasha3));
    }
}
