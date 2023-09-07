package com.pingwit.core.les_30.point_3;

import java.util.concurrent.Exchanger;

public class ExchangerMain {

    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();

        ExchangerRunnable exRun1 = new ExchangerRunnable(ex, "Hello");
        ExchangerRunnable exRun2 = new ExchangerRunnable(ex, "Private");
        ExchangerRunnable exRun3 = new ExchangerRunnable(ex, "Ola");
        ExchangerRunnable exRun4 = new ExchangerRunnable(ex, "Czesc");

        new Thread(exRun1).start();
        new Thread(exRun2).start();
        new Thread(exRun3).start();
        new Thread(exRun4).start();
    }
}
