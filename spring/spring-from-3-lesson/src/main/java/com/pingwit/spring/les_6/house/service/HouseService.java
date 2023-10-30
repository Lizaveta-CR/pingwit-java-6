package com.pingwit.spring.les_6.house.service;

import com.pingwit.spring.les_6.house.entity.House;
import com.pingwit.spring.les_6.house.repository.HouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HouseService {

    private final HouseRepository houseRepository;

    public House save(House house) {
        return houseRepository.save(house);
    }
}
