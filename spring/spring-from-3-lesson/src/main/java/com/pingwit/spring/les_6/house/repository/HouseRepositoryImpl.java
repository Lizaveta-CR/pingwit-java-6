package com.pingwit.spring.les_6.house.repository;

import com.pingwit.spring.les_6.house.entity.House;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class HouseRepositoryImpl implements HouseCustomRepository {

    private final EntityManager entityManager;

    @Override
    public List<House> findHousesByResidentsNames(List<String> residentNames) {
//        String query = """
//                SELECT h FROM House h
//                JOIN h.houseResidents hr
//                WHERE hr.name in (:rs)
//            """;
//        Query jpqlQuery = entityManager.createQuery(query);
//        jpqlQuery.setParameter("rs", residentNames);
//        return jpqlQuery.getResultList();

        String query = """
                SELECT h FROM House h
                JOIN FETCH h.houseResidents hr
                JOIN FETCH h.address a
                WHERE hr.name in (:rs)
            """;
        TypedQuery<House> jpqlQuery = entityManager.createQuery(query, House.class);
        jpqlQuery.setParameter("rs", residentNames);
        return jpqlQuery.getResultList();
    }
}
