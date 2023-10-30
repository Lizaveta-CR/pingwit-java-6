package com.pingwit.spring.les_6.house.service;

import com.pingwit.spring.les_6.house.entity.HouseResident;
import com.pingwit.spring.les_6.house.repository.HouseResidentRepository;
import java.util.Collection;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HouseResidentService {

    private final HouseResidentRepository houseResidentRepository;

    public List<HouseResident> findAllById(Collection<Long> ids) {
        return IterableUtils.toList(houseResidentRepository.findAllById(ids));
    }
}
