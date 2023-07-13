package com.pingwit.core.les_19.classwork.point_3;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(9);
        integerQueue.add(2);
        integerQueue.add(4);
        System.out.println(integerQueue);

        int first = integerQueue.poll();
        System.out.println(first);
        int second = integerQueue.poll();
        System.out.println(second);
        int third = integerQueue.peek();
        System.out.println(third);
        System.out.println(integerQueue);

        Queue<Integer> llQueue = new LinkedList<>();
    }
}
