package com.pingwit.core.les_9.homework.task_3;

public class Car {
    private String model;
    private Engine engine;
    private Transmission transmission;

    public Car(String model) {
        this.model = model;
        this.engine = new Engine();
        this.transmission = new Transmission();
    }

    public void gas() {
        if (engine.isStarted()) {
            System.out.println("Let's go!");
        } else {
            System.out.println("Release the pedal!");
        }
    }

    public void move() {
        if (!engine.isStarted()) {
            engine.turnOnTheEngine();
            transmission.increaseGear();
            gas();
        }
    }

    public void acceleration() {
        if (engine.isStarted()) {
            transmission.increaseGear();
            gas();
        }
    }

    public void stop() {
        if (engine.isStarted()) {
            transmission.decreaseGear();
            engine.shutOffTheEngine();
        }
    }

    public int getSpeed() {
        return transmission.getCurrentGear() * 20;
    }

    @Override
    public String toString() {
        return "Car: " +
            "number= " + model;
    }
}
