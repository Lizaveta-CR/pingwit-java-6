package com.pingwit.spring.les_3.point_1;

import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile({"test"})
public class TestStudentRepositoryImpl implements StudentRepository {

    @PostConstruct
    public void init() {
        System.out.println("Test bean");
    }
}
