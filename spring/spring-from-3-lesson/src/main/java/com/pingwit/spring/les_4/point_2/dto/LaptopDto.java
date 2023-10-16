package com.pingwit.spring.les_4.point_2.dto;

import com.pingwit.spring.les_4.point_2.entity.Processor;
import com.pingwit.spring.les_4.point_2.entity.Producer;
import java.math.BigDecimal;

public record LaptopDto(Long id, Producer producer, Processor processor, BigDecimal price) {}
