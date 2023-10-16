package com.pingwit.spring.les_4.point_2.repository;

import com.pingwit.spring.les_4.point_2.entity.Laptop;
import com.pingwit.spring.les_4.point_2.entity.Processor;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

//crud - create, read, update, delete
public interface LaptopRepository extends CrudRepository<Laptop, Long> {

    List<Laptop> findAllByProcessor(Processor processor);

    List<Laptop> findAllByPriceBetween(BigDecimal from, BigDecimal to);

    List<Laptop> findAllByPriceGreaterThan(BigDecimal from);
}
