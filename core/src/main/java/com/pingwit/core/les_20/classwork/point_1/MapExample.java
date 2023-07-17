package com.pingwit.core.les_20.classwork.point_1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "les_1");
        map.put(2, "les_2");
        if (map.containsKey(2)) {
            String les2 = map.get(2);
            System.out.println(les2);
        }
        map.containsValue("les_1");
        Collection<String> values = map.values();
        Set<Integer> integers = map.keySet();
//        map.remove(1);
        String les3 = map.getOrDefault(3, "les_3");
        System.out.println(map);
        map.put(2, "les_3");
        map.putIfAbsent(2, "les_5");
        System.out.println(map);
        map.replace(1, "les_6");
        System.out.println(map);
    }
}
