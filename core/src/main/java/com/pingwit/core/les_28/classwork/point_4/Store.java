package com.pingwit.core.les_28.classwork.point_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Store {

    private int product = 0;

    public synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.printf("[%s]Buyer bought 1 product", LocalDateTime.now().format(DateTimeFormatter.ISO_DATE));
        System.out.println("(GET)Products in the store: " + product);
        notify();
    }

    public synchronized void put() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.printf("[%s]Producer added 1 product", LocalDateTime.now().format(DateTimeFormatter.ISO_DATE));
        System.out.println("(GET)Products in the store: " + product);
        notify();
    }
}
