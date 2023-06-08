package com.pingwit.core.les_9.classwork.point_2;

public class Bicycle extends Vehicle{

    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("I'm driving bicycle!");
    }
}
