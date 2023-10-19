package com.pingwit.spring.les_4.point_2.api;

import com.pingwit.spring.les_4.point_2.dto.LaptopDto;
import com.pingwit.spring.les_4.point_2.entity.Laptop;
import com.pingwit.spring.les_4.point_2.entity.Processor;
import com.pingwit.spring.les_4.point_2.service.LaptopService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<LaptopDto> save(@RequestBody LaptopDto laptopDto) throws IllegalArgumentException {
        Laptop model = laptopConverter.toModel(laptopDto);
        Laptop saved = laptopService.doTransaction(model);
        return new ResponseEntity<>(laptopConverter.toDto(saved), HttpStatus.CREATED);
    }

    @GetMapping
    public Page<LaptopDto> getAll(@RequestParam(required = false) Processor processor,
                                  @RequestParam(required = false, defaultValue = "0") int page,
                                  @RequestParam(required = false, defaultValue = "100") int size) {
        PageRequest pageRequest = PageRequest.of(page, size, Sort.by("id").descending());
        Page<Laptop> laptops;
        if (processor == null) {
            laptops = laptopService.getAll(pageRequest);
        } else {
            laptops = laptopService.getAllByProcessor(processor, pageRequest);
        }
        List<LaptopDto> laptopsDto = laptops.stream()
            .map(laptopConverter::toDto)
            .collect(Collectors.toList());
        return new PageImpl<>(laptopsDto, pageRequest, laptops.getTotalElements());
    }
}
