package com.pingwit.spring.les_1.classwork.point_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
//    @Qualifier("userJdbcConnector")
    private JdbcConnector jdbcConnector;

    @Override
    public User save(User user) {
        jdbcConnector.runQuery();
//        jdbcConnector.save(user);
        return null;
    }
}
