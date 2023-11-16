package com.pingwit.spring.les_11.classwork.service;

import com.pingwit.spring.les_11.classwork.Tesla;
import com.pingwit.spring.les_11.classwork.repository.TeslaRepository;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Validated
@Service
@Slf4j
public class TeslaService {

    private final TeslaRepository teslaRepository;

    public TeslaService(TeslaRepository teslaRepository) {this.teslaRepository = teslaRepository;}

    public Tesla save(@Valid Tesla tesla) {
        Tesla saved = teslaRepository.save(tesla);
        log.debug("Tesla with id = {} and vin = {} finished saving", saved.id(), saved.vin());
        return saved;
    }
}
