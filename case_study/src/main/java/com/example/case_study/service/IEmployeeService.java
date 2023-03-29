package com.example.case_study.service;

import com.example.case_study.dto.EmployeeDto;
import com.example.case_study.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    Page<Employee> findAllEmployee(Pageable pageable);
    void save(Employee employee);
}
