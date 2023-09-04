package com.pingwit.core.les_29.practice.point_5;

import com.pingwit.core.les_29.practice.point_5.entity.Airport;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrencyCollectionsExample {

    public static void main(String[] args) throws InterruptedException {
        Airport airport = new Airport();

        int quantity = 100;
        Runnable run1 = () -> {
            for (int i = 0; i < quantity; i++) {
                airport.arrive(1);
                airport.checkIn("Aerobus", "John_" + i);
                airport.checkIn("Aerobus", "Nataly_" + i);
                airport.checkIn("Boening", "Christian_" + i);
                airport.checkIn("Boening", "Jakub" + i);
                airport.checkIn("Boening", "Mike" + i);
            }
        };

        Runnable operatorDonald = () -> {
            for (int i = 0; i < quantity; i++) {
                airport.arrive(1);
                airport.checkIn("Boening", "Sabrina_" + i);
                airport.checkIn("Boening", "Donatello_" + i);
                airport.checkIn("Aerobus", "Rafael_" + i);
                airport.checkIn("Aerobus", "Daniel_" + i);
                airport.checkIn("Boening", "Kasia" + i);
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(run1);
        executorService.submit(operatorDonald);

        executorService.awaitTermination(10, TimeUnit.SECONDS);

        executorService.shutdown();
        System.out.println(airport.getArrivedAirplanes());
        airport.printDashboard();
    }
}
