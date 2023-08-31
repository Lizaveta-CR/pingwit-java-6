package com.pingwit.core.les_28.classwork.point_2;

public class MyRunnableExample implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Thread ->>" + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(String.format("Thread name = %s finished", Thread.currentThread().getName()));
    }
}
