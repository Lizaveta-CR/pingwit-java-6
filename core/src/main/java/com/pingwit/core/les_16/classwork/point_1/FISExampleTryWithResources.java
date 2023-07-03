package com.pingwit.core.les_16.classwork.point_1;

import java.io.FileInputStream;
import java.io.IOException;

public class FISExampleTryWithResources {
    private static final String FILE_NAME = "core/src/main/java/com/pingwit/core/les_16/classwork/point_1/resources/input.txt";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(FILE_NAME)) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error while reading from file: " + e.getMessage());
        }
    }
}
