package com.pingwit.core.les_11.classwork.point_2;

public class Main {

    public static void main(String[] args) {
        Animal dog1 = new Dog();
        Dog dog2 = new Dog();

        boolean bool = dog2 instanceof Animal;
        boolean bool2 = dog1 instanceof Animal;
        System.out.println(bool);
        System.out.println(bool2);

        Flyable bird = new Bird();
        Flyable airplane = new Airplane();

        if (bird instanceof Flyable) {
            System.out.println("bird is instanceof Animal");
        }


        if (airplane instanceof Flyable) {
            System.out.println("airplane is instanceof Animal");
        }

        if (airplane instanceof Dog) {
        }else {
            System.out.println("airplane is not a Dog!");
        }
    }
}
