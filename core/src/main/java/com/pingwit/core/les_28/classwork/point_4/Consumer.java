package com.pingwit.core.les_28.classwork.point_4;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            store.get();
        }
    }
}
