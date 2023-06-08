package com.pingwit.core.les_9.classwork.point_1;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        print(cat);
        Animal dog = new Dog();
        print(dog);
        Animal.someStaticMethod();
    }

    public static void print(Animal animal) {
        animal.eat();
        animal.move();
        animal.sleep();
    }
}
