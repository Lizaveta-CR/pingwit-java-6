package com.pingwit.core.les_29.practice.point_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);

        executorService.shutdown();
    }
}
