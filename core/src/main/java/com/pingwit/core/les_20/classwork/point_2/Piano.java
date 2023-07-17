package com.pingwit.core.les_20.classwork.point_2;

import java.util.Objects;

public class Piano {
    private String producer;
    private String color;
    private boolean electric;

    public Piano(String producer, String color, boolean electric) {
        this.producer = producer;
        this.color = color;
        this.electric = electric;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Piano piano = (Piano) o;
        return electric == piano.electric && Objects.equals(producer, piano.producer) && Objects.equals(color, piano.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, color, electric);
    }

    @Override
    public String toString() {
        return "Piano{" +
            "producer='" + producer + '\'' +
            ", color='" + color + '\'' +
            ", electric=" + electric +
            '}';
    }
}
