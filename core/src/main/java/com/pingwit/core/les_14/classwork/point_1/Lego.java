package com.pingwit.core.les_14.classwork.point_1;

public class Lego {

    @NotEmpty
    private String type;
    @Size(min = 2, max = 11)
    private Integer elementsQuantity;
    @NotEmpty
    private String serial;

    public Lego(String type, Integer elementsQuantity, String serial) {
        this.type = type;
        this.elementsQuantity = elementsQuantity;
        this.serial = serial;
    }

    public String getType() {
        return type;
    }

    public Integer getElementsQuantity() {
        return elementsQuantity;
    }
}
