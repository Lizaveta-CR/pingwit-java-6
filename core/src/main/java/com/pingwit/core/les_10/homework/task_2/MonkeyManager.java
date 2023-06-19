package com.pingwit.core.les_10.homework.task_2;

public class MonkeyManager {

    public int countFruits(Monkey monkey, Tree[] trees) {
        int count = 0;
        for (Tree tree : trees) {
            Branch branch = tree.mainBranch();
            Fruit branchFruit = branch.getFruit();
            Fruit[] monkeyFruits = monkey.getKnownFruits();
            if (containsBranchFruit(branchFruit, monkeyFruits)) {
                count += branch.getNumOfFruits();
            } else {
                System.out.print(" I don't know this fruit, so i will return 0");
            }
        }
        return count;
    }

    private boolean containsBranchFruit(Fruit branchFruit, Fruit[] monkeyFruits) {
        boolean containsFruit = false;
        for (Fruit monkeyFruit : monkeyFruits) {
            if (branchFruit.equals(monkeyFruit)) {
                containsFruit = true;
                break;
            }
        }
        return containsFruit;
    }
}
