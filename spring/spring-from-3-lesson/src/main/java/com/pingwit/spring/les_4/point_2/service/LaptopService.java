package com.pingwit.spring.les_4.point_2.service;

import com.pingwit.spring.les_4.point_2.entity.Laptop;
import com.pingwit.spring.les_4.point_2.entity.Processor;
import com.pingwit.spring.les_4.point_2.repository.LaptopRepository;
import java.util.List;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    private final LaptopRepository laptopRepository;

    public LaptopService(LaptopRepository laptopRepository) {this.laptopRepository = laptopRepository;}

    public Laptop save(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public List<Laptop> getAll() {
        return IterableUtils.toList(laptopRepository.findAll());
    }

    public List<Laptop> getAllByProcessor(Processor processor) {
        return IterableUtils.toList(laptopRepository.findAllByProcessor(processor));
    }
}
