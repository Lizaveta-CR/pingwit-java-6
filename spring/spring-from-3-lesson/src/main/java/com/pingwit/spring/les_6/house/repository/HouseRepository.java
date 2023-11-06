package com.pingwit.spring.les_6.house.repository;

import com.pingwit.spring.les_6.house.entity.House;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface HouseRepository extends PagingAndSortingRepository<House, Long>, HouseCustomRepository {

    @Query(
        """
            SELECT h FROM House h
            JOIN FETCH h.houseResidents hr
            JOIN FETCH h.address a
            WHERE hr.id IN (:ids)
            """
    )
    List<House> findAllResidentsHouses(@Param("ids") List<Long> residents);

    @Modifying
    @Query("update House h set h.floor = :floor where h.id = 1")
    void updateFloor(@Param("floor") Long floor);
}
