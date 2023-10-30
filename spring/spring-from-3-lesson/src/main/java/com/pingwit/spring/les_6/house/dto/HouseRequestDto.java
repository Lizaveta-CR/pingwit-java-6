package com.pingwit.spring.les_6.house.dto;

import com.pingwit.spring.les_6.house.entity.HouseType;
import java.util.List;

public record HouseRequestDto(
    Long id,
    HouseType houseType,
    Integer floor,
    AddressDto address,
    List<Long> elevators,
    List<Long> residents) {}
