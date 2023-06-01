package com.pingwit.core.les_7.classwork.point_2;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(false);
        User user2 = new User(true);

        Car car = new Car(10, "Audi");
        if (user1.isAllowed()) {
            car.setModel("BMW");
        }
        System.out.println(car);

        if (user2.isAllowed()) {
            car.setModel("Renault");
            car.setAge(-10);
        }
        System.out.println(car);
//        System.out.println(car);
//        car.setModel("BMW");
//        System.out.println(car);
//        int age = car.getAge();
//        System.out.println(age);
//
//        car.model = "BMW";
//        System.out.println(car.age);
    }
}
