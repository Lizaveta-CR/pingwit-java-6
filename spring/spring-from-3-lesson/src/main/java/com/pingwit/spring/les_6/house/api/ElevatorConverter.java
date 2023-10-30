package com.pingwit.spring.les_6.house.api;

import com.pingwit.spring.les_6.house.dto.ElevatorDto;
import com.pingwit.spring.les_6.house.entity.Elevator;
import org.springframework.stereotype.Component;

@Component
public class ElevatorConverter {

    public ElevatorDto toDto(Elevator elevator) {
        return new ElevatorDto(elevator.getId(), elevator.getProducer(), elevator.getSerialNo());
    }
}
