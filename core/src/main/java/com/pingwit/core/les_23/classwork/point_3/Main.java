package com.pingwit.core.les_23.classwork.point_3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        List<Order> orders = Arrays.asList(new Order(1), new Order(2));
        Optional<Order> orderById = orderService.findById(orders, 3);
        System.out.println(orderById);
        if (orderById.isPresent()) {
            Order order = orderById.get();
            System.out.println(order.id());
            System.out.println(order);
        }

        Optional<Object> empty = Optional.empty();
        Optional<Order> order = Optional.of(new Order(1));
        Optional<Order> byIdOptional = Optional.ofNullable(orderService.findById2(orders, 5));

        Order byId2 = orderService.findById2(orders, 5);
        System.out.println(byId2.id());
    }

    private static Integer sum(Integer first, Integer second) {
        return Optional.ofNullable(first)
            .map(x -> x + second)
            .orElseThrow(() -> new RuntimeException("First is null"));
    }
}
