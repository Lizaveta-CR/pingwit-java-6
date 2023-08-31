package com.pingwit.core.les_28.classwork.point_3;

import com.pingwit.core.les_28.classwork.point_3.entity.Stock;

public class RunnableExample {

    public static void main(String[] args) throws InterruptedException {
        Stock stock = new Stock(0);
        EmployeeServiceRunnable runnable = new EmployeeServiceRunnable(stock, 10000);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(stock);
        System.out.println("Main finished");
    }
}
