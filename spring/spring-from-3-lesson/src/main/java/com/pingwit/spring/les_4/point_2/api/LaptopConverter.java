package com.pingwit.spring.les_4.point_2.api;

import com.pingwit.spring.les_4.point_2.dto.LaptopDto;
import com.pingwit.spring.les_4.point_2.entity.Laptop;
import org.springframework.stereotype.Component;

@Component
public class LaptopConverter {

    public Laptop toModel(LaptopDto laptopDto) {
        Laptop laptop = new Laptop();
        laptop.setProducer(laptopDto.producer());
        laptop.setProcessor(laptopDto.processor());
        laptop.setPrice(laptopDto.price());
        return laptop;
    }

    public LaptopDto toDto(Laptop laptop) {
        return new LaptopDto(laptop.getId(), laptop.getProducer(), laptop.getProcessor(), laptop.getPrice());
    }
}
