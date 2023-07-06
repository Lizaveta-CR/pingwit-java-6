package com.pingwit.core.les_17.classwork.point_1;

import java.io.Serial;
import java.io.Serializable;

public class Work implements Serializable {
    @Serial
    private static final long serialVersionUID = 2462749801930213773L;
    private String name;

    public Work(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Work{" +
            "name='" + name + '\'' +
            '}';
    }
}
