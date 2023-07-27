package com.pingwit.core.les_22.classwork.point_1;

@FunctionalInterface
public interface SimpleFuncInterface {

    void show();

    default void def1() {
        //code
    }

    default void def2() {
        //code
    }
}

class B implements SimpleFuncInterface {

    @Override
    public void show() {
        System.out.println("Hi!");
    }
}

class Demo {
    public static void main(String[] args) {
        SimpleFuncInterface sfi = () -> System.out.println("Hi from lambda expression!!!");
        sfi.show();
    }
}