package com.pingwit.core.les_28.classwork.point_4;

public class Producer implements Runnable{

    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            store.put();
        }
    }
}
