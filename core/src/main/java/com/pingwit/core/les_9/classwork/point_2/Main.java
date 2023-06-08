package com.pingwit.core.les_9.classwork.point_2;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Audi", "CarField");
        Car car2 = new Car("Audi", "CarField2");
        System.out.println(car.getName());
        System.out.println(car.equals(car2));
        print(car);
        Bicycle bicycle = new Bicycle("Aist");
        print(bicycle);
    }

    public static void print(Vehicle vehicle) {
        vehicle.drive();
    }
}
