package com.pingwit.core.les_30.point_6;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class FerryCyclicBarrierMain {

    public static void main(String[] args) throws InterruptedException {
        int numOfCars = 9;

        CyclicBarrier cyclicBarrier = new CyclicBarrier(numOfCars, new FerryBoard());
        for (int i = 0; i < numOfCars; i++) {
            Car car = new Car(cyclicBarrier, i);
            new Thread(car).start();
            Thread.sleep(400);
        }
    }
}

class FerryBoard implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println("Паром переправил автомобили!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Car implements Runnable {
    private final CyclicBarrier cyclicBarrier;
    private final int carNum;

    Car(CyclicBarrier cyclicBarrier, int carNum) {
        this.cyclicBarrier = cyclicBarrier;
        this.carNum = carNum;
    }

    @Override
    public void run() {
        try {
            System.out.printf("Автом N%d подъехал к паромной переправе\n", carNum);
            cyclicBarrier.await();
            System.out.printf("Автом N%d продолжил движение\n", carNum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}