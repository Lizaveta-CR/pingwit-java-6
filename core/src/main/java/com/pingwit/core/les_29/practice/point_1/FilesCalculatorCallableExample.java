package com.pingwit.core.les_29.practice.point_1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FilesCalculatorCallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String path = "core/src/main/java/com/pingwit/core";

        FilesCalculatorCallable filesCalculatorCallable = new FilesCalculatorCallable(path);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> result = executorService.submit(filesCalculatorCallable);

        Integer intRes = result.get();
        System.out.println("After get()");
        System.out.println("result: " + intRes);

        executorService.shutdown();
    }
}
