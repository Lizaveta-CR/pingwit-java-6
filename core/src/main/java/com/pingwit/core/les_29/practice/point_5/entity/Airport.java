package com.pingwit.core.les_29.practice.point_5.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Airport {

    private Queue<Integer> arrivedAirplanes = new ConcurrentLinkedDeque<>();
    private Map<String, List<String>> airplaneToPassengersMap = new ConcurrentHashMap<>();

    public void arrive(Integer airplane) {
        arrivedAirplanes.add(airplane);
    }

    public void checkIn(String airplane, String passenger) {
        List<String> passengers = airplaneToPassengersMap.getOrDefault(airplane, new ArrayList<>());
        passengers.add(passenger);
        airplaneToPassengersMap.put(airplane, passengers);
    }

    public Integer getArrivedAirplanes() {
        return arrivedAirplanes.size();
    }

    public void printDashboard() {
        System.out.println("Total airplanes: " + airplaneToPassengersMap.size());
        long count = airplaneToPassengersMap.values().stream().flatMap(Collection::stream).count();
        System.out.println("Total passengers: " + count);

        airplaneToPassengersMap.forEach((airplane, passengers) -> {
                System.out.println(airplane);
                System.out.println(passengers);
            }
        );
        //Airobus
        //[lena, pasha]
    }

    @Override
    public String toString() {
        return "Airport{" +
            "arrivedAirplanes=" + arrivedAirplanes +
            ", passengersByAirplane=" + airplaneToPassengersMap +
            '}';
    }
}
