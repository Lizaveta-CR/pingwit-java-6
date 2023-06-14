package com.pingwit.core.les_9.homework.task_3;

public class Transmission {
    public static final int MAX_GEAR = 7;
    private int currentGear;

    public void increaseGear() {
        if (currentGear >= 0 && currentGear <= MAX_GEAR) {
            currentGear++;
        } else {
            System.out.println("Sorry, but i can't do more");
        }
        System.out.println("Gear increased: " + currentGear);
    }

    public void decreaseGear() {
        if (currentGear > 0 && currentGear <= MAX_GEAR) {
            currentGear--;
        } else {
            System.out.println("Sorry, it's my minimum");
        }
        System.out.println("Gear decreased: " + currentGear);
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
