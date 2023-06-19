package com.pingwit.core.les_10.homework.task_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Tree[] trees = {
            new Tree(new Branch(Fruit.COCONUT)),
            new Tree(new Branch(Fruit.BANANA)),
            new Tree(new Branch(Fruit.COCONUT, 11)),
            new Tree(new Branch(Fruit.BANANA, 11))
        };
        MonkeyManager monkeyManager = new MonkeyManager();
        Monkey[] monkeys = {
            new Monkey(new Fruit[] {Fruit.COCONUT}),
            new Monkey(new Fruit[] {Fruit.BANANA}),
            new Monkey(new Fruit[] {Fruit.COCONUT, Fruit.BANANA})
        };

        for (Monkey monkey : monkeys) {
            System.out.println("Monkey : " + monkey);
            System.out.println("Is counting on trees: " + Arrays.toString(trees));
            System.out.println("The result is: " + monkeyManager.countFruits(monkey, trees));
        }
    }
}
