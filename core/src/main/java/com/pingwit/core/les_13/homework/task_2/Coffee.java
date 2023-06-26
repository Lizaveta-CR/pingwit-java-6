package com.pingwit.core.les_13.homework.task_2;

import java.util.Objects;

public class Coffee extends Product {
    private String type;

    public Coffee(String name, double price, int quantity, String type) {
        super(name, price, quantity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Coffee{" +
            "type='" + type + '\'' +
            "} " + super.toString();
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
        Coffee coffee = (Coffee) o;
        return Objects.equals(type, coffee.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
