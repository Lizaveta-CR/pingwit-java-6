package com.pingwit.core.les_9.homework.task_2.sol_1;

public class CountryHouse extends House {

    public CountryHouse(int floors, int citizens, boolean hasHeating) {
        super(HouseType.COUNTRY_HOUSE, floors, citizens, hasHeating);
    }

    @Override
    public String toString() {
        return "CountryHouse{" +
            "type=" + type +
            '}';
    }
}
