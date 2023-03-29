package com.example.case_study.repository;


import com.example.case_study.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAll();
    @Query(value ="select * from employee", nativeQuery = true)
    Page<Employee> findAllEmployee(Pageable pageable);
}
