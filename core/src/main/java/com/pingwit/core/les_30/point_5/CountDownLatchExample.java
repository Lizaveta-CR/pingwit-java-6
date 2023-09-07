package com.pingwit.core.les_30.point_5;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        List<String> racers = List.of("Liza", "Nastya", "Liza2", "Yaroslav");

        for (int i = 0; i < 4; i++) {
            Runner runner = new Runner(racers.get(i), countDownLatch);
            new Thread(runner).start();
        }

        System.out.printf("Preparing for start...");
        Thread.sleep(2000);
        System.out.printf("Let's begin!");
        countDownLatch.countDown();
        countDownLatch.countDown();
    }
}

class Runner implements Runnable {
    private final String name;
    private final CountDownLatch countDownLatch;

    Runner(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.countDown();
            System.out.printf("[%s] racer is waiting!", name);
            countDownLatch.await();
            System.out.println();
            System.out.printf("[%s] racer moving!", name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
