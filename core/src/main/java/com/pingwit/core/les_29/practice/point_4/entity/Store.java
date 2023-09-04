package com.pingwit.core.les_29.practice.point_4.entity;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Store {

    private final AtomicInteger hotDogsStatistics = new AtomicInteger();
    private final AtomicLong vegetablesStatistics = new AtomicLong();
    private final AtomicBoolean isOpen = new AtomicBoolean();

    public Integer eat() {
        return hotDogsStatistics.incrementAndGet();
    }

    public Integer getHotDogStatistics() {
        return hotDogsStatistics.get();
    }
}
