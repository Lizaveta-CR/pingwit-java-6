package com.pingwit.core.les_13.classwork.point_1;

public class PicturePNG extends AbstractPicture {

    public PicturePNG(double width) {
        super(width);
    }

    @Override
    public double getWidth() {
        System.out.println("Inside PNG");
        return width * 20;
    }

    @Override
    public PictureType getPictureType() {
        return PictureType.PNG;
    }
}
