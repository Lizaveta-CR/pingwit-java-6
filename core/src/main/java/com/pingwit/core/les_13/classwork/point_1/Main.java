package com.pingwit.core.les_13.classwork.point_1;

public class Main {

    public static void main(String[] args) {
        AbstractPicture picture = generatePicture();

        double width = picture.getWidth();
        System.out.println(width);
        System.out.println(picture.getPictureType());
    }

    private static AbstractPicture generatePicture() {
        return new PicturePNG(0.7);
    }
}
