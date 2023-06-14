package com.pingwit.core.les_9.homework.task_2.sol_2;

public abstract class House {
    private final int floors;
    private final int citizens;
    private boolean hasHeating;

    protected House(int floors, int citizens, boolean hasHeating) {
        this.floors = floors;
        this.citizens = citizens;
        this.hasHeating = hasHeating;
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

    @Override
    public String toString() {
        return "House{" +
            "floors=" + floors +
            ", citizens=" + citizens +
            ", hasHeating=" + hasHeating +
            '}';
    }
}
