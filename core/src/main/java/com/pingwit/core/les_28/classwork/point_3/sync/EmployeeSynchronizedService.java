package com.pingwit.core.les_28.classwork.point_3.sync;

import com.pingwit.core.les_28.classwork.point_3.entity.Stock;

public class EmployeeSynchronizedService {

    public synchronized void addSync(Stock stock) {
        stock.setQuantity(stock.getQuantity() + 1);
    }

    public void addSyncBlock(Stock stock) {
        //какая-то логика

        synchronized (stock) {
            stock.setQuantity(stock.getQuantity() + 1);
        }
    }

    public void addSyncBlockThis(Stock stock) {
        synchronized (this) {
            stock.setQuantity(stock.getQuantity() + 1);
        }
    }

    public void addSyncClass(Stock stock) {
        synchronized (EmployeeSynchronizedService.class) {
            stock.setQuantity(stock.getQuantity() + 1);
        }
    }
}
