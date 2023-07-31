package com.pingwit.core.les_23.classwork.point_3;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    Optional<Order> findById(List<Order> orders, int id);
}
