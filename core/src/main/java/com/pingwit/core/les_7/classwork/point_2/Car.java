package com.pingwit.core.les_7.classwork.point_2;

public class Car {
    private int age;
    private String model;

    public Car(int age, String model) {
        this.age = age;
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
            "age=" + age +
            ", model='" + model + '\'' +
            '}';
    }
}
