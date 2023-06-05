package com.pingwit.core.les_7.homework.harvest;

import java.math.BigDecimal;

public class HarvestStatistic {
    private String plant;
    private BigDecimal totalWeight;

    public HarvestStatistic(String plant, BigDecimal totalWeight) {
        this.plant = plant;
        this.totalWeight = totalWeight;
    }

    public String getPlant() {
        return plant;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }
}
