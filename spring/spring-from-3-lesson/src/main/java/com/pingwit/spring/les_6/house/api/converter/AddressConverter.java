package com.pingwit.spring.les_6.house.api.converter;

import com.pingwit.spring.les_6.house.dto.AddressDto;
import com.pingwit.spring.les_6.house.entity.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressConverter {

    public AddressDto toDto(Address address) {
        return new AddressDto(address.getId(), address.getCity(), address.getStreet(), address.getNumber());
    }

    public Address toModel(AddressDto dto) {
        return new Address(dto.id(), dto.city(), dto.street(), dto.number());
    }
}
