package com.pingwit.core.les_10.homework.task_2;

import java.util.Arrays;

public class Monkey {
    private Fruit[] knownFruits;

    public Monkey(Fruit[] knownFruits) {
        this.knownFruits = knownFruits;
    }

    public Fruit[] getKnownFruits() {
        return knownFruits;
    }

    @Override
    public String toString() {
        return "Monkey{" +
            "knownFruits=" + Arrays.toString(knownFruits) +
            '}';
    }
}
