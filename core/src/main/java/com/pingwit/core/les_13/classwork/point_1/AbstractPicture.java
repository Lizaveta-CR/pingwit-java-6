package com.pingwit.core.les_13.classwork.point_1;

public abstract class AbstractPicture implements Picture {

    protected double width;

    public AbstractPicture(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
