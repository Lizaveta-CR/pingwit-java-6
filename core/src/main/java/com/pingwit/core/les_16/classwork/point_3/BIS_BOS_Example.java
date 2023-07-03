package com.pingwit.core.les_16.classwork.point_3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BIS_BOS_Example {

    public static void main(String[] args) {
//        bos();
        bis();
    }

    private static void bos() {
        String message = "Have a nice day!";
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            baos.write(message.getBytes());
            byte[] bytes = baos.toByteArray();
            System.out.println(Arrays.toString(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bis() {
        byte[] array = {72, 97, 118, 101, 32, 97, 32, 110, 105, 99, 101, 32, 100, 97, 121, 33};
        try (ByteArrayInputStream bais = new ByteArrayInputStream(array)) {

            for (byte elem : array) {
                char data = (char) bais.read();
                System.out.print(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
