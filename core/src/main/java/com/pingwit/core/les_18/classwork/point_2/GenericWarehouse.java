package com.pingwit.core.les_18.classwork.point_2;

import java.util.Arrays;

public class GenericWarehouse<T> {

    private T[] products;

    public GenericWarehouse(T[] products) {
        this.products = products;
    }

    public T[] getProducts() {
        return products;
    }

    public void setProducts(T[] products) {
        this.products = products;
    }

    public void addProduct(T product) {
        T[] newProducts = Arrays.copyOf(products, products.length + 1);
        newProducts[products.length] = product;
        setProducts(newProducts);
    }
}
