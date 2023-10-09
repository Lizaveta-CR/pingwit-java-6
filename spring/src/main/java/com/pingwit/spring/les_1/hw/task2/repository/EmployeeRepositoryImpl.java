package com.pingwit.spring.les_1.hw.task2.repository;

import com.pingwit.spring.les_1.hw.task2.model.Employee;
import com.pingwit.spring.les_1.hw.task2.model.EmployeeCriteria;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Qualifier("jbdcEmployeeConnector")
    private final JdbcConnector<Employee, EmployeeCriteria> jdbcConnector;

    public EmployeeRepositoryImpl(JdbcConnector<Employee, EmployeeCriteria> jdbcConnector) {
        this.jdbcConnector = jdbcConnector;
    }

    @Override
    public List<Employee> getAll() {
        return jdbcConnector.getAll();
    }

    @Override
    public List<Employee> getAll(EmployeeCriteria criteria) {

        return jdbcConnector.getAll(criteria);
    }
}
