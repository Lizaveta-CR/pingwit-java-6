package com.pingwit.core.les_28.classwork.point_1;

public class Main {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        thread.setName("custom");
        System.out.println(thread);
//        thread.getPriority();
//        thread.setPriority();
    }
}
