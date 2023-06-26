package com.pingwit.core.les_13.homework.task_2;

public class Store {
    public static void main(String[] args) {
        Product[] products = new Product[] {
            new Apple("Apple", 10, 5, Color.RED),
            new Apple("Apple", 10, 5, Color.GREEN),
            new Coffee("Coffee", 20, 1, "arabica"),
            new Coffee("Coffee", 20, 1, "robusta"),
            new Computer("Computer", 1000, 1, "Intel", 16)
        };
        Cart cart = new Cart(products);

        User user = new User("Vasya", 20, cart);
        System.out.println(user.getName() + " has " + user.getCart().getTotalQuantity() + " products in cart");
        System.out.println(user.getName() + " has " + user.getCart().getTotalPrice() + " in cart");
        System.out.println("Cart contains:");
        user.getCart().printCart();
        System.out.println("=====");
        cart.removeProduct(new Apple("Apple", 10, 5, Color.RED));
        user.getCart().printCart();
        System.out.println("=====");
        cart.addProduct(new Apple("Apple", 10, 5, Color.RED));
        user.getCart().printCart();
    }
}
