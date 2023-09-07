package com.pingwit.core.les_30.point_3;

import java.util.concurrent.Exchanger;

public class ExchangerRunnable implements Runnable {

    private final Exchanger<String> ex;
    private final String name;

    public ExchangerRunnable(Exchanger<String> ex, String name) {
        this.ex = ex;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            String exchange = ex.exchange(name);
            Thread.sleep(2000);
            System.out.println("Sent: " + name + "; Exchange: " + exchange);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
