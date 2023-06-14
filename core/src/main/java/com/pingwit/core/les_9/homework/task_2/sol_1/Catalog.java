package com.pingwit.core.les_9.homework.task_2.sol_1;

public record Catalog(House[] houses) {

    @Override
    public House[] houses() {
        return houses.clone();
    }
}
