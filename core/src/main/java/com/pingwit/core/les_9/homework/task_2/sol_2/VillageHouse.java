package com.pingwit.core.les_9.homework.task_2.sol_2;

public class VillageHouse extends House {

    public VillageHouse(int floors, int citizens, boolean hasHeating) {
        super(floors, citizens, hasHeating);
    }

    @Override
    public void turnOnHeating() {
        System.out.println("Village house has no heating");
    }
}
