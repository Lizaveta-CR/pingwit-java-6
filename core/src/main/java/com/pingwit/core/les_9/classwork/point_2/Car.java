package com.pingwit.core.les_9.classwork.point_2;

import java.util.Objects;

public class Car extends Vehicle {
    private String carSpecificField;

    public Car(String name, String carSpecificField) {
        super(name);
        this.carSpecificField = carSpecificField;
    }

    @Override
    public void drive() {
        System.out.println("I'm driving car!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(carSpecificField, car.carSpecificField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carSpecificField);
    }
}
