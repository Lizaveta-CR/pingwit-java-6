package com.pingwit.spring.les_4.point_2.repository;

import com.pingwit.spring.les_4.point_2.entity.Laptop;
import com.pingwit.spring.les_4.point_2.entity.Processor;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

//crud - create, read, update, delete
public interface LaptopRepository extends PagingAndSortingRepository<Laptop, Long> {

    Page<Laptop> findAllByProcessor(Processor processor, Pageable pageable);

    List<Laptop> findAllByPriceBetween(BigDecimal from, BigDecimal to);

    List<Laptop> findAllByPriceGreaterThan(BigDecimal from);
}
