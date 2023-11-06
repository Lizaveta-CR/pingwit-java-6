package com.pingwit.spring.les_6.house.api.converter;

import com.pingwit.spring.les_6.house.dto.ResidentDto;
import com.pingwit.spring.les_6.house.entity.HouseResident;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ResidentConverter {

    public ResidentDto toDto(HouseResident resident) {
        return new ResidentDto(resident.getId(), resident.getName());
    }

    public HouseResident toModel(ResidentDto dto) {
        return new HouseResident(dto.id(), dto.name());
    }
}
