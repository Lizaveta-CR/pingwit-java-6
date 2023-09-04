package com.pingwit.core.les_29.practice.point_6;

public class DaemonThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            try {
                Thread.sleep(5_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread = new Thread(runnable);
        thread.setDaemon(true); // если закомментировать строку, то программа будет ждать окончание выполнения Runnable

        thread.start();
//        thread.join();

        System.out.println("The end");
    }
}
