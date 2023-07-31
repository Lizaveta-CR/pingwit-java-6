package com.pingwit.core.les_23.classwork.point_3;

import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements OrderService {

    @Override
    public Optional<Order> findById(List<Order> orders, int id) {
        Optional<Order> order = orders.stream()
            .filter(o -> o.id() == id)
            .findAny();
        return order;
    }
}
