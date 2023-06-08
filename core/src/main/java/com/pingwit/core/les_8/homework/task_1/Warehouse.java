package com.pingwit.core.les_8.homework.task_1;

public class Warehouse {
    private final Box[] boxes;
    private int currentIndex;

    public Warehouse(Box[] boxes) {
        this.boxes = boxes;
        currentIndex = 0;
    }

    public Box next() {
        Box next = boxes[currentIndex];
        currentIndex++;
        if (currentIndex == boxes.length) {
            currentIndex = 0;
        }
        return next;
    }
}