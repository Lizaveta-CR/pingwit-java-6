package com.pingwit.spring.les_6.house.api.converter;

import com.pingwit.spring.les_6.house.dto.AddressDto;
import com.pingwit.spring.les_6.house.dto.ElevatorDto;
import com.pingwit.spring.les_6.house.dto.HouseResponseDto;
import com.pingwit.spring.les_6.house.dto.ResidentDto;
import com.pingwit.spring.les_6.house.entity.House;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class HouseResponseConverter {

    private final AddressConverter addressConverter;
    private final ElevatorConverter elevatorConverter;
    private final ResidentConverter houseResidentConverter;

    public HouseResponseConverter(AddressConverter addressConverter, ElevatorConverter elevatorConverter, ResidentConverter houseResidentConverter) {
        this.addressConverter = addressConverter;
        this.elevatorConverter = elevatorConverter;
        this.houseResidentConverter = houseResidentConverter;
    }

    public HouseResponseDto toDto(House house) {
        AddressDto addressDto = addressConverter.toDto(house.getAddress());
        List<ElevatorDto> elevatorDtos = house.getElevators().stream().map(elevatorConverter::toDto).toList();
        List<ResidentDto> houseResidentDtos = house.getHouseResidents().stream().map(houseResidentConverter::toDto).toList();

        return new HouseResponseDto(
            house.getId(),
            house.getHouseType(),
            house.getFloor(),
            addressDto,
            elevatorDtos,
            houseResidentDtos
        );
    }
}
