package com.pingwit.core.les_21.classwork.point_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 1. upper bound wildcard - ? extends Type
 2. lower bound wildcard - ? super Type
 3. unbounded wildcard - ?
 */
public class Main {

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        List<Animal> animals = new ArrayList<>();

//        iterateAnimals(cats);
        iterateAnimalsExtends(cats);
        iterateAnimals(animals);
        iterateAnimal(new Cat());

        iterateAnimalsSuper(animals);
        iterateAnimalsSuper(List.of(new Pet()));
//        iterateAnimalsSuper(cats);
        iterateAnimalsAll(cats);
    }

    public static void iterateAnimals(Collection<Animal> animals) {
        for (Animal an : animals) {
            System.out.println("Inside loop one more time");
        }
    }

//    public static void iterateAnimals(Collection<Cat> animals) {
//        for (Animal an : animals) {
//            System.out.println("Inside loop one more time");
//        }
//    }
//
//    public static void iterateAnimals(Collection<Pet> animals) {
//        for (Animal an : animals) {
//            System.out.println("Inside loop one more time");
//        }
//    }

    public static void iterateAnimalsExtends(Collection<? extends Pet> animals) {
        for (Animal an : animals) {
            System.out.println("Inside loop one more time");
        }
//        animals.add(new Cat());
//        animals.add(new Animal());
//        animals.add(new Pet());
    }

    public static void iterateAnimalsSuper(Collection<? super Pet> animals) {
        for (Object an : animals) {
            System.out.println("Inside loop one more time");
        }
        animals.add(new Cat());
//        animals.add(new Animal());
    }

    public static void iterateAnimalsAll(Collection<?> animals) {
        for (Object an : animals) {
            System.out.println("Inside loop one more time");
        }
    }

    public static void iterateAnimal(Animal animals) {
        System.out.println("sss");
    }
}
