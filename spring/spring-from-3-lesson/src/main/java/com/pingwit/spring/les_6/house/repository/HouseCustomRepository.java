package com.pingwit.spring.les_6.house.repository;

import com.pingwit.spring.les_6.house.entity.House;
import java.util.List;

public interface HouseCustomRepository {

    List<House> findHousesByResidentsNames(List<String> residentNames);
}
