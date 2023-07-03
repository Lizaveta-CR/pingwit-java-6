package com.pingwit.core.les_16.classwork.point_1;

import java.io.FileInputStream;
import java.io.IOException;

public class FISExample {

    private static final String FILE_NAME = "core/src/main/java/com/pingwit/core/les_16/classwork/point_1/resources/input.txt";

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(FILE_NAME);
            int data;
            while ((data = fis.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            System.out.println("Error while reading from file: " + e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
