package com.pingwit.core.les_13.homework.task_2;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products.clone();
    }

    public void addProduct(Product product) {
        Product[] newProducts = new Product[products.length + 1];
        /*
            source_arr : array to be copied from
            sourcePos : starting position in source array from where to copy
            dest_arr : array to be copied in
            destPos : starting position in destination array, where to copy in
         */
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[newProducts.length - 1] = product;
        products = newProducts;
    }

    public void removeProduct(Product product) {
        Product[] newProducts = new Product[products.length - 1];
        int index = 0;
        for (Product element : products) {
            if (!element.equals(product)) {
                newProducts[index++] = element;
            }
        }
        products = newProducts;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice() * product.getQuantity();
        }
        return totalPrice;
    }

    public int getTotalQuantity() {
        int quantity = 0;
        for (Product product : products) {
            quantity += product.getQuantity();
        }
        return quantity;
    }

    public void printCart() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
