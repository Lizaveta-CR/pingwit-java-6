package com.pingwit.core.les_9.classwork.point_1;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
