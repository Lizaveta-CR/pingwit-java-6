package com.pingwit.core.les_21.classwork.point_1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();
        books.add(new Book("Potter", "Auskin", 2012));
        books.add(new Book("Potter", "Dostoevsky", 2012));
        books.add(new Book("Potter", "Auskin", 2001));

        System.out.println(books);

        System.out.println("====Custom comparator");
        Comparator<Book> bookYearComparator = new BookYearComparator();
        bookYearComparator = bookYearComparator.thenComparing(new BookNameComparator());
        bookYearComparator = bookYearComparator.reversed();
        Set<Book> booksCustom = new TreeSet<>(bookYearComparator);
        booksCustom.add(new Book("Potter", "Auskin", 2012));
        booksCustom.add(new Book("APotter", "Dostoevsky", 2012));
        booksCustom.add(new Book("Potter", "Auskin", 2001));

        System.out.println(booksCustom);
    }
}
