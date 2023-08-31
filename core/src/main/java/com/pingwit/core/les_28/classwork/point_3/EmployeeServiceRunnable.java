package com.pingwit.core.les_28.classwork.point_3;

import com.pingwit.core.les_28.classwork.point_3.entity.Stock;

public class EmployeeServiceRunnable implements Runnable {

    private final Stock stock;
    private final Integer quantity;

    public EmployeeServiceRunnable(Stock stock, Integer quantity) {
        this.stock = stock;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < quantity; i++) {
            System.out.printf("Hello from %s: %d", name, i);
            System.out.println();
            stock.setQuantity(stock.getQuantity() + 1);

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finished: " + name);
    }
}
