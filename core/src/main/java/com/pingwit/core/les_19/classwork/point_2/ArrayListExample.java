package com.pingwit.core.les_19.classwork.point_2;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();

        ArrayList<String> languagesList = new ArrayList<>();

        //add elements to AL
        addElements(languagesList);

        //get elements
        getElements(languagesList);

        //change elements
        languagesList.set(0, "JavaScript");
        System.out.println(languagesList);

        //remove elements
        removeElements(languagesList);

        boolean contains = languagesList.contains("Swift");
        System.out.println(contains);

        languagesList.isEmpty();
    }

    private static void removeElements(ArrayList<String> languagesList) {
        int predLast = languagesList.size() - 2;
        languagesList.remove(predLast);
//        languagesList.remove("Swift");
        System.out.println(languagesList);
//        System.out.println("Clearing collection: ");
//        languagesList.clear();
        System.out.println(languagesList);
        System.out.println(languagesList.size());
    }

    private static void getElements(ArrayList<String> languagesList) {
        String first = languagesList.get(0);
        String second = languagesList.get(1);
        String third = languagesList.get(2);
        String last = languagesList.get(languagesList.size() - 1);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(last);
    }

    private static void addElements(ArrayList<String> languagesList) {
        languagesList.add("Java");
        languagesList.add("Python");
        languagesList.add("Swift");
        languagesList.add("Swift");
        languagesList.add("Swift");
        languagesList.add("Swift");
        languagesList.add("Swift");
        languagesList.add("Swift");
        languagesList.add("Swift");
        languagesList.add("Swift");
        languagesList.add("C++");
        System.out.println(languagesList.size());
        System.out.println(languagesList);
    }
}
