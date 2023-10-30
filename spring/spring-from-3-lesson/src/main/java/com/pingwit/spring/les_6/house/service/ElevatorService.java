package com.pingwit.spring.les_6.house.service;

import com.pingwit.spring.les_6.house.entity.Elevator;
import com.pingwit.spring.les_6.house.repository.ElevatorRepository;
import java.util.Collection;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ElevatorService {

    private final ElevatorRepository elevatorRepository;

    public List<Elevator> findAllById(Collection<Long> ids) {
        return IterableUtils.toList(elevatorRepository.findAllById(ids));
    }
}
