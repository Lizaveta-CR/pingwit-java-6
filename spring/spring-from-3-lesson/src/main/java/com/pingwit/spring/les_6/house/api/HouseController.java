package com.pingwit.spring.les_6.house.api;

import com.pingwit.spring.les_6.house.dto.HouseRequestDto;
import com.pingwit.spring.les_6.house.entity.House;
import com.pingwit.spring.les_6.house.service.HouseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/houses")
public class HouseController {

    private final HouseService houseService;
    private final HouseConverter houseConverter;

    public HouseController(HouseService houseService, HouseConverter houseConverter) {
        this.houseService = houseService;
        this.houseConverter = houseConverter;
    }

    @PostMapping
    public House save(@RequestBody HouseRequestDto dto) {
        House model = houseConverter.toModel(dto);
        return houseService.save(model);
    }
}
