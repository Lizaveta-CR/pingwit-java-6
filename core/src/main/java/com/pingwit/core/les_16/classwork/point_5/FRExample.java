package com.pingwit.core.les_16.classwork.point_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FRExample {
    private static final String FILE_PATH = "core/src/main/java/com/pingwit/core/les_16/classwork/point_5/eminem_lose_yourself.txt";

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(FILE_PATH);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
