package com.pingwit.spring.les_6.house.repository;

import com.pingwit.spring.les_6.house.entity.HouseResident;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HouseResidentRepository extends PagingAndSortingRepository<HouseResident, Long> {
}
