package com.pingwit.spring.les_6.house.service;

import static java.lang.String.format;

import com.pingwit.spring.les_6.house.entity.House;
import com.pingwit.spring.les_6.house.repository.HouseRepository;
import com.pingwit.spring.les_6.house.repository.HouseResidentRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class HouseService {

    private final HouseRepository houseRepository;
    private final HouseResidentRepository houseResidentRepository;
    private final BeanUtilService beanUtilService;

    public House save(House house) {
        return houseRepository.save(house);
    }

    public void delete(Long id) {
        findById(id);
        houseRepository.deleteById(id);
    }

    //    @Transactional(readOnly = true)
    public House findById(Long id) {
        return houseRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException(format("House with id=%d wasn't found", id)));
    }

    public House update(Long id, House house) {
        House existing = findById(id);

        beanUtilService.copyProperties(house, existing);
        return houseRepository.save(existing);
    }

    @Transactional
    public void updateFloor(Long floor) {
        houseRepository.updateFloor(floor);
    }

    public List<House> findHousesByResidentsNames(List<String> residents) {
        return houseRepository.findHousesByResidentsNames(residents);
    }

    public List<House> findAllResidentsHouses(List<Long> residents) {
        return houseRepository.findAllResidentsHouses(residents);
    }
}
