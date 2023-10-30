package com.pingwit.spring.les_6.house.dto;

import com.pingwit.spring.les_6.house.entity.HouseType;
import java.util.List;

public record HouseResponseDto(
    Long id,
    HouseType houseType,
    Integer floor,
    AddressDto addressDto,
    List<ElevatorDto> elevators,
    List<ResidentDto> residents) {}
