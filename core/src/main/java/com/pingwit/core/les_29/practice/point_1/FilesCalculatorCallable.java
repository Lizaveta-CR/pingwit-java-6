package com.pingwit.core.les_29.practice.point_1;

import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FilesCalculatorCallable implements Callable<Integer> {
    private final String path;

    public FilesCalculatorCallable(String path) {this.path = path;}

    @Override
    public Integer call() throws Exception {
        File file = new File(path);

        Thread.sleep(5_000);
        System.out.println("After sleep");

        return file.listFiles().length;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String path = "core/src/main/java/com/pingwit/core";

        FutureTask<Integer> future = new FutureTask<>(new FilesCalculatorCallable(path));
        new Thread(future).start();

        Integer res = future.get();
        System.out.println(res);
    }
}
