package com.example.case_study.repository;

import com.example.case_study.model.AttachFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IAttachFacilityRepository extends JpaRepository<AttachFacility, Integer> {
    List<AttachFacility> findAll();
}
