package com.pingwit.core.les_9.homework.task_2.sol_2;

public class Main {

    public static void main(String[] args) {
        House[] houses = {
            new HighRiseHouse(10, 100, true),
            new VillageHouse(11, 22, false),
        };
        Catalog catalog = new Catalog(houses);
        for (House house : catalog.houses()) {
            house.turnOnHeating();
            System.out.println(house);
        }
    }
}
