package com.pingwit.core.les_20.classwork.point_0;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    public static void main(String[] args) {
        List<String> lessons = new ArrayList<>();
        lessons.add("Collections");
        lessons.add("Collections 2");
        lessons.add("Comparator, Wildcard ");
        lessons.add("Functional Interfaces");

        for (String lesson : lessons) {
            System.out.println(lesson);
        }
    }
}
