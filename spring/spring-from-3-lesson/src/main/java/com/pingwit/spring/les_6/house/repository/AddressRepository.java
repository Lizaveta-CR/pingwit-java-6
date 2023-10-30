package com.pingwit.spring.les_6.house.repository;

import com.pingwit.spring.les_6.house.entity.Address;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {
}
