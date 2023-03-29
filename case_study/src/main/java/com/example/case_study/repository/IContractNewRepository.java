package com.example.case_study.repository;

import com.example.case_study.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractNewRepository extends JpaRepository<Contract, Integer> {
}
