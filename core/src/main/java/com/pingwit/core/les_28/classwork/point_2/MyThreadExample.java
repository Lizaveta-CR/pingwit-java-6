package com.pingwit.core.les_28.classwork.point_2;

public class MyThreadExample extends Thread {

    public MyThreadExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.printf("Hello from %s \n", super.getName());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(String.format("Thread name = %s finished", Thread.currentThread().getName()));
    }
}
