package com.pingwit.spring.les_4.point_2.api;

import com.pingwit.spring.les_4.point_2.dto.LaptopDto;
import com.pingwit.spring.les_4.point_2.entity.Laptop;
import com.pingwit.spring.les_4.point_2.entity.Processor;
import com.pingwit.spring.les_4.point_2.service.LaptopService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

    private final LaptopService laptopService;
    private final LaptopConverter laptopConverter;

    public LaptopController(LaptopService laptopService, LaptopConverter laptopConverter) {
        this.laptopService = laptopService;
        this.laptopConverter = laptopConverter;
    }

    @PostMapping
    public LaptopDto save(@RequestBody LaptopDto laptopDto) {
        Laptop model = laptopConverter.toModel(laptopDto);
        Laptop saved = laptopService.save(model);
        return laptopConverter.toDto(saved);
    }

    @GetMapping
    public List<LaptopDto> getAll(@RequestParam(required = false) Processor processor) {
        List<Laptop> laptops;
        if (processor == null) {
            laptops = laptopService.getAll();
        } else {
            laptops = laptopService.getAllByProcessor(processor);
        }
        return laptops.stream()
            .map(laptopConverter::toDto)
            .collect(Collectors.toList());
    }
}
