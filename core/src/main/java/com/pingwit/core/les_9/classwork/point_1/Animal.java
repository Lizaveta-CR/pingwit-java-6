package com.pingwit.core.les_9.classwork.point_1;

public interface Animal {
    double WEIGHT = 1.4;

    static void someStaticMethod() {
        System.out.println("Lalala");
    }

    void eat();

    void move();

    default void sleep() {
        System.out.println("Animal is sleeping");
    }
}
