package com.pingwit.core.les_20.classwork.point_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<Piano> pianos = new HashSet<>();

        pianos.add(new Piano("YAMAHA", "black", true));
        pianos.add(new Piano("YAMAHA", "black", true));
        pianos.add(new Piano("CASIO", "white", true));

        for (Piano piano : pianos) {
            System.out.println(piano);
        }

        Set<Integer> ints = new HashSet<>();
        ints.add(1);
        ints.add(1);
        ints.add(1);
        ints.add(1);
        ints.add(2);
        System.out.println(ints);

        Set<Integer> ints2 = new HashSet<>();
        ints2.add(1);
        ints2.add(3);
        ints2.add(3);
        ints2.add(5);
        boolean added = ints.addAll(ints2);
        System.out.println(ints);

        Iterator<Integer> iterator = ints.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
