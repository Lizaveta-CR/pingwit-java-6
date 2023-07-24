package com.pingwit.core.les_20.classwork.point_1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "A");
        treeMap.put(3, "B");
        treeMap.put(2, "B");
        treeMap.put(5, "B");
        treeMap.put(4, "B");
        treeMap.put(10, null);
//        treeMap.put(null, null);
        System.out.println(treeMap);
    }
}
