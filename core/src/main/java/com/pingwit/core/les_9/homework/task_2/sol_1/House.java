package com.pingwit.core.les_9.homework.task_2.sol_1;

public abstract class House {
    protected final HouseType type;
    private final int floors;
    private final int citizens;
    private boolean hasHeating;

    public House(HouseType type, int floors, int citizens, boolean hasHeating) {
        this.type = type;
        this.floors = floors;
        this.citizens = citizens;
        this.hasHeating = hasHeating;
    }

    public HouseType getType() {
        return type;
    }

    public int getFloors() {
        return floors;
    }

    public int getCitizens() {
        return citizens;
    }

    public boolean hasHeating() {
        return hasHeating;
    }

    public void turnOnHeating() {
        if (hasHeating) {
            System.out.println("Heating is already turned on");
        } else {
            this.hasHeating = true;
        }
    }
}
