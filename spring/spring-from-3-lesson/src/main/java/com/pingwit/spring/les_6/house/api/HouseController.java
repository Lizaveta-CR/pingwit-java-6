package com.pingwit.spring.les_6.house.api;

import com.pingwit.spring.les_6.house.api.converter.HouseConverter;
import com.pingwit.spring.les_6.house.api.converter.HouseResponseConverter;
import com.pingwit.spring.les_6.house.dto.HouseRequestDto;
import com.pingwit.spring.les_6.house.dto.HouseResponseDto;
import com.pingwit.spring.les_6.house.entity.House;
import com.pingwit.spring.les_6.house.service.HouseService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/houses")
public class HouseController {

    private final HouseService houseService;
    private final HouseConverter houseConverter;
    private final HouseResponseConverter houseResponseConverter;

    public HouseController(HouseService houseService, HouseConverter houseConverter, HouseResponseConverter houseResponseConverter) {
        this.houseService = houseService;
        this.houseConverter = houseConverter;
        this.houseResponseConverter = houseResponseConverter;
    }

    @PostMapping
    public HouseResponseDto save(@RequestBody HouseRequestDto dto) {
        House model = houseConverter.toModel(dto);
        House saved = houseService.save(model);
        return houseResponseConverter.toDto(saved);
    }

    @PutMapping("/{id}")
    public HouseResponseDto update(@PathVariable Long id, @RequestBody HouseRequestDto dto) {
        House model = houseConverter.toModel(dto);
        House saved = houseService.update(id, model);
        return houseResponseConverter.toDto(saved);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        houseService.delete(id);
    }

    @GetMapping("/{id}")
    public HouseResponseDto getById(@PathVariable Long id) {
        House house = houseService.findById(id);
        return houseResponseConverter.toDto(house);
    }

    @GetMapping("/search/residents")
    public List<HouseResponseDto> findHousesByResidentsNames(@RequestParam List<Long> residents) {
        List<House> houses = houseService.findAllResidentsHouses(residents);
        return houses.stream()
            .map(houseResponseConverter::toDto)
            .toList();
    }
}
