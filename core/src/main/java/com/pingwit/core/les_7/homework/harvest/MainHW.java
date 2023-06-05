package com.pingwit.core.les_7.homework.harvest;

import java.math.BigDecimal;

public class MainHW {
    public static void main(String[] args) {

        /*Harvest[] harvests = new Harvest[5];
        harvests[0] = new Harvest(1, "Field A", "Wheat", new BigDecimal(10));
        harvests[1] = new Harvest(2, "Field A", "Rye", new BigDecimal(20));
        harvests[2] = new Harvest(3, "Field B", "Wheat", new BigDecimal(15));
        harvests[3] = new Harvest(4, "Field B", "Potato", new BigDecimal("21.1"));
        harvests[4] = new Harvest(5, "Field C", "Strawberry", new BigDecimal(19));
        */
        Harvest[] harvests = {
            new Harvest(1, "Field A", "Wheat", new BigDecimal(10)),
            new Harvest(2, "Field A", "Rye", new BigDecimal(20)),
            new Harvest(3, "Field B", "Wheat", new BigDecimal(15)),
            new Harvest(4, "Field B", "Potato", new BigDecimal("21.1")),
            new Harvest(5, "Field C", "Wheat", new BigDecimal(19))
        };

        HarvestStatisticService service = new HarvestStatisticService();
        HarvestStatistic[] statistics = service.calculateStatistics(harvests);

        for (HarvestStatistic s : statistics) {
            System.out.println(s.getPlant() + ": " + s.getTotalWeight());
        }
    }
}
