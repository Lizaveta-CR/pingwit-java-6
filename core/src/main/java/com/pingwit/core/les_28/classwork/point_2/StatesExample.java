package com.pingwit.core.les_28.classwork.point_2;

public class StatesExample {

    public static void main(String[] args) {
        MyThreadExample thread = new MyThreadExample("aaa");
        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getState());

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(thread.getState());
    }
}
