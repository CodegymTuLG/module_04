package com.example.case_study.repository;

import com.example.case_study.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IFacilityRepository extends JpaRepository<Facility, Integer> {
    List<Facility> findAll();
}
