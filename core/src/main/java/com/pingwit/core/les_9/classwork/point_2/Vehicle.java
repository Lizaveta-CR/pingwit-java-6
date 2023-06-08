package com.pingwit.core.les_9.classwork.point_2;

import java.util.Objects;

public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void drive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(name, vehicle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
