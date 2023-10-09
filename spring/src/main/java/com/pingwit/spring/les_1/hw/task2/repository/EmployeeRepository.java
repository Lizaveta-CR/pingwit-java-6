package com.pingwit.spring.les_1.hw.task2.repository;

import com.pingwit.spring.les_1.hw.task2.model.EmployeeCriteria;
import com.pingwit.spring.les_1.hw.task2.model.Employee;
import java.util.List;

public interface EmployeeRepository {

    List<Employee> getAll();

    List<Employee> getAll(EmployeeCriteria criteria);
}
