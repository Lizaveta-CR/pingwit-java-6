package com.pingwit.core.les_7.homework.harvest;

import java.math.BigDecimal;

public class HarvestStatisticService {
    public HarvestStatistic[] calculateStatistics(Harvest[] harvests) {
        // Step 1: find all unique plants in the harvests
        String[] plantNames = findUniquePlantNames(harvests);

        // Step 2: calculate total weight for each plant
        HarvestStatistic[] statistics = calculateStatistics(harvests, plantNames);

        return statistics;
    }

    private HarvestStatistic[] calculateStatistics(Harvest[] harvests, String[] plantNames) {
        HarvestStatistic[] statistics = new HarvestStatistic[plantNames.length];
        int numPlants = plantNames.length;
        for (int i = 0; i < numPlants; i++) {
            String plant = plantNames[i];
            BigDecimal totalWeight = BigDecimal.ZERO;
            for (Harvest h : harvests) {
                if (h.getPlant().equals(plant)) {
                    totalWeight = totalWeight.add(h.getWeight());
                }
            }
            statistics[i] = new HarvestStatistic(plant, totalWeight);
        }
        return statistics;
    }

    private String[] findUniquePlantNames(Harvest[] harvests) {
        String[] plantNames = new String[harvests.length];
        int numPlants = 0;
        for (Harvest h : harvests) {
            boolean found = false;
            for (int i = 0; i < numPlants; i++) {
                if (h.getPlant().equals(plantNames[i])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                plantNames[numPlants] = h.getPlant();
                numPlants++;
            }
        }
        return plantNames;
    }
}
