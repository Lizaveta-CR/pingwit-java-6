package com.pingwit.spring.les_1.hw.task2.repository;

import java.util.List;

public interface JdbcConnector<T, C> {

    List<T> getAll();

    List<T> getAll(C criteria);
}
