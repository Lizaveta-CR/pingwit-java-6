package com.pingwit.core.les_28.classwork.point_3.sync;

import com.pingwit.core.les_28.classwork.point_3.entity.Stock;

public class EmployeeServiceSynchronizedRunnable implements Runnable {

    private final EmployeeSynchronizedService employeeSynchronizedService;
    private final Stock stock;
    private final Integer quantity;

    public EmployeeServiceSynchronizedRunnable(EmployeeSynchronizedService employeeSynchronizedService, Stock stock, Integer quantity) {
        this.employeeSynchronizedService = employeeSynchronizedService;
        this.stock = stock;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < quantity; i++) {
            System.out.printf("Hello from %s: %d", name, i);
            System.out.println();
            employeeSynchronizedService.addSync(stock);

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finished: " + name);
    }
}
