package com.pingwit.core.les_16.classwork.point_4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DOS_Example {
    private static final String FILE_PATH = "core/src/main/java/com/pingwit/core/les_16/classwork/point_4/dos.txt";

    public static void main(String[] args) {
        dos();
        dis();
    }

    private static void dis() {
        try (FileInputStream fis = new FileInputStream(FILE_PATH);
             DataInputStream dis = new DataInputStream(fis)) {

            boolean bool = dis.readBoolean();
            System.out.println(bool);

            float fl = dis.readFloat();
            System.out.println(fl);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void dos() {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH);
             DataOutputStream dos = new DataOutputStream(fos)) {

            dos.writeBoolean(true);
            dos.writeFloat(1.16f);

            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
