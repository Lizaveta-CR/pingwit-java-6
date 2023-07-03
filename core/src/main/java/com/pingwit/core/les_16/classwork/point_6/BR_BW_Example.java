package com.pingwit.core.les_16.classwork.point_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BR_BW_Example {
    private static final String FILE_PATH = "core/src/main/java/com/pingwit/core/les_16/classwork/point_6/console.txt";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {

            String text;
            while (!(text = br.readLine()).equals("ESC")) {
                bw.write(text + "\n");
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
