package com.pingwit.core.les_18.classwork.point_1;

//<T extends B1 & B2 & B3>
public class Account<T, N extends Number> {
    private T id;
    private N sum;
    private String country;

    public <D> Account(T id, N sum, D country) {
        this.id = id;
        this.sum = sum;
        this.country = country.toString();
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public N getSum() {
        return sum;
    }

    public void setSum(N sum) {
        this.sum = sum;
    }
}
