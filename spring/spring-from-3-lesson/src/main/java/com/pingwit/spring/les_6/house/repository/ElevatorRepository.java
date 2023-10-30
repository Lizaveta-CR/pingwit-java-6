package com.pingwit.spring.les_6.house.repository;

import com.pingwit.spring.les_6.house.entity.Elevator;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ElevatorRepository extends PagingAndSortingRepository<Elevator, Long> {
}
