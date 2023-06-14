package com.pingwit.core.les_9.homework.task_2.sol_1;

public class Main {

    public static void main(String[] args) {
        House[] houses = {
            new HighRiseBuilding(10, 100, true),
            new CountryHouse(11, 22, false),
        };
        Catalog catalog = new Catalog(houses);
        for (House house : catalog.houses()) {
            System.out.println(house.getType());
            house.turnOnHeating();
        }
    }
}
