package com.pingwit.spring.les_6.house.repository;

import com.pingwit.spring.les_6.house.entity.House;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HouseRepository extends PagingAndSortingRepository<House, Long> {
}
