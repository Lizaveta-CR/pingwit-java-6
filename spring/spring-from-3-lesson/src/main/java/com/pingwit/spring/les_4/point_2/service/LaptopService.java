package com.pingwit.spring.les_4.point_2.service;

import com.pingwit.spring.les_4.point_2.entity.Laptop;
import com.pingwit.spring.les_4.point_2.entity.Processor;
import com.pingwit.spring.les_4.point_2.repository.LaptopRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LaptopService {

    private final LaptopRepository laptopRepository;

    public LaptopService(LaptopRepository laptopRepository) {this.laptopRepository = laptopRepository;}

    @Transactional(rollbackFor = IllegalArgumentException.class)
    public Laptop save(Laptop laptop) throws IllegalArgumentException {
        Laptop save = laptopRepository.save(laptop);

        exceptionGenerator();
        return save;
    }

    //rollback will not be occurred
    public Laptop doTransaction(Laptop laptop) throws IllegalArgumentException {
//        code
        return save(laptop);
    }

    public Page<Laptop> getAll(Pageable pageable) {
        //300 - total elements, 0 - page, 100 -size
//        laptops.getContent() - 100
//        laptops.getTotalElements() - 300
//        laptops.getTotalPages() - 3
        return laptopRepository.findAll(pageable);
    }

    public Page<Laptop> getAllByProcessor(Processor processor, Pageable pageable) {
        return laptopRepository.findAllByProcessor(processor, pageable);
    }

    private void exceptionGenerator() throws IllegalArgumentException {
        throw new IllegalArgumentException("My unknown message");
    }
}
