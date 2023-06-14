package com.pingwit.core.les_9.homework.task_3;

public class Engine {
    private boolean start;

    public void shutOffTheEngine() {
        if (isStarted()) {
            start = false;
            System.out.println("The engine is off");
        } else {
            System.out.println("The engine is already off");
        }
    }

    public void turnOnTheEngine() {
        if (isStarted()) {
            System.out.println("The engine is already on");
        } else {
            start = true;
            System.out.println("The engine is on");
        }
    }

    public boolean isStarted() {
        return start;
    }
}
