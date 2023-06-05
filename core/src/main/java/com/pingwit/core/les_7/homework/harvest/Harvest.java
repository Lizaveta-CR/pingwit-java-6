package com.pingwit.core.les_7.homework.harvest;

import java.math.BigDecimal;

public class Harvest {
    private long id;
    private String field;
    private String plant;
    private BigDecimal weight;

    public Harvest(long id, String field, String plant, BigDecimal weight) {
        this.id = id;
        this.field = field;
        this.plant = plant;
        this.weight = weight;
    }

    public String getPlant() {
        return plant;
    }

    public BigDecimal getWeight() {
        return weight;
    }
}
