package com.pingwit.core.les_13.homework.task_2;

import java.util.Objects;

public class Apple extends Product {
    private Color color;

    public Apple(String name, double price, int quantity, Color color) {
        super(name, price, quantity);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Apple{" +
            "color='" + color + '\'' +
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
        Apple apple = (Apple) o;
        return color == apple.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
