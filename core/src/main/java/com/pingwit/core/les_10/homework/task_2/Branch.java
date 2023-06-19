package com.pingwit.core.les_10.homework.task_2;

import java.util.Random;

public class Branch {
    private static final int MAX_FRUIT_AMOUNT = 100;
    private Fruit fruit;
    private int numOfFruits;

    public Branch(Fruit fruit) {
        this(fruit, new Random().nextInt(MAX_FRUIT_AMOUNT));
    }

    public Branch(Fruit fruit, int numOfFruits) {
        this.fruit = fruit;
        this.numOfFruits = numOfFruits;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public int getNumOfFruits() {
        return numOfFruits;
    }

    @Override
    public String toString() {
        return "Branch{" +
            "fruit=" + fruit +
            ", numOfFruits=" + numOfFruits +
            '}';
    }
}
