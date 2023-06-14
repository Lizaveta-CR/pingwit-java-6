package com.pingwit.core.les_9.homework.task_3;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Renault");
        System.out.println(car);
        System.out.println("==moving==");
        car.move();
        System.out.println("Current speed = " + car.getSpeed());
        System.out.println("=acceleration==");
        car.acceleration();
        System.out.println("Speed = " + car.getSpeed());
        car.acceleration();
        System.out.println("Speed = " + car.getSpeed());
        car.stop();
    }
}
