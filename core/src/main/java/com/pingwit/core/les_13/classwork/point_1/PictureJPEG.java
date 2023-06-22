package com.pingwit.core.les_13.classwork.point_1;

public class PictureJPEG extends AbstractPicture {

    private String superProperty;

    public PictureJPEG(String superProperty, double width) {
        super(width);
        this.superProperty = superProperty;
    }

    @Override
    public double getWidth() {
        System.out.println("Inside JPEG");
        return super.getWidth() * 10;
    }

    @Override
    public PictureType getPictureType() {
        return PictureType.JPEG;
    }
}
