package com.pingwit.core.les_28.classwork.point_3.entity;

public class Stock {

    private Integer quantity;

    public Stock(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
            "quantity=" + quantity +
            '}';
    }
}
