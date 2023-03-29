package com.example.case_study.service;


import com.example.case_study.model.Employee;
import com.example.case_study.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private IEmployeeRepository employeeRepository;
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Page<Employee> findAllEmployee(Pageable pageable) {
        return employeeRepository.findAllEmployee(pageable);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }
}
