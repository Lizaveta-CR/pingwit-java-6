package com.pingwit.spring.les_1.hw.task2.service;

import com.pingwit.spring.les_1.hw.task2.model.EmployeeCriteria;
import com.pingwit.spring.les_1.hw.task2.model.Employee;
import com.pingwit.spring.les_1.hw.task2.repository.EmployeeRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.getAll();
    }

    @Override
    public List<Employee> getAll(EmployeeCriteria criteria) {
        return employeeRepository.getAll(criteria);
    }
}
