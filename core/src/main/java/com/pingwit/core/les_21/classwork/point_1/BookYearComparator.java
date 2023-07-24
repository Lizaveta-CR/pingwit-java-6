package com.pingwit.core.les_21.classwork.point_1;

import java.util.Comparator;

public class BookYearComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o2.year() - o1.year();
    }
}
