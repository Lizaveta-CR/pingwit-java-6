package com.pingwit.spring.les_11.classwork.api.controller;

import com.pingwit.spring.les_11.classwork.Tesla;
import com.pingwit.spring.les_11.classwork.service.TeslaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tesla")
@Slf4j
public class TeslaController {

    private final TeslaService teslaService;

    public TeslaController(TeslaService teslaService) {this.teslaService = teslaService;}

    @PostMapping
    public Tesla save(@RequestBody Tesla tesla) {
        log.info("Recieved Tesla with model={} for saving", tesla.model());
        return teslaService.save(tesla);
    }
}
