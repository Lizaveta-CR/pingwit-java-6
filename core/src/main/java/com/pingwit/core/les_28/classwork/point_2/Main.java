package com.pingwit.core.les_28.classwork.point_2;

public class Main {

    public static void main(String[] args) {
        MyRunnableExample myRunnableExample = new MyRunnableExample();
        Thread thread = new Thread(myRunnableExample);
        thread.start();
        System.out.println("bla-bla");

        MyThreadExample custom = new MyThreadExample("custom");
        custom.start();
    }
}
