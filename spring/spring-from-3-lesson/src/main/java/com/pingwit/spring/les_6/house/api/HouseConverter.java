package com.pingwit.spring.les_6.house.api;

import com.pingwit.spring.les_6.house.dto.HouseRequestDto;
import com.pingwit.spring.les_6.house.dto.HouseResponseDto;
import com.pingwit.spring.les_6.house.entity.House;
import com.pingwit.spring.les_6.house.service.AddressService;
import com.pingwit.spring.les_6.house.service.ElevatorService;
import com.pingwit.spring.les_6.house.service.HouseResidentService;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HouseConverter {

    private final AddressService addressService;
    private final HouseResidentService houseResidentService;
    private final ElevatorService elevatorService;
    private final AddressConverter addressConverter;
    private final ElevatorConverter elevatorConverter;
    private final ResidentConverter residentConverter;

    public House toModel(HouseRequestDto dto) {
        House house = new House();
        house.setId(dto.id());
        house.setHouseType(dto.houseType());
        house.setFloor(dto.floor());
        house.setAddress(addressService.findById(dto.addressId())
            .orElseThrow(() -> new IllegalArgumentException(String.format("address id=%d does not exist", dto.addressId()))));
        house.setHouseResidents(houseResidentService.findAllById(dto.residents()));
        house.setElevators(elevatorService.findAllById(dto.elevators()));

        return house;
    }

    public HouseResponseDto toDto(House house) {
        return new HouseResponseDto(
            house.getId(),
            house.getHouseType(),
            house.getFloor(),
            addressConverter.toDto(house.getAddress()),
            house.getElevators().stream().map(elevatorConverter::toDto).collect(Collectors.toList()),
            house.getHouseResidents().stream().map(residentConverter::toDto).collect(Collectors.toList())
        );
    }
}
