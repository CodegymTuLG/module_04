package com.example.case_study.service;

import com.example.case_study.model.Facility;
import com.example.case_study.repository.IFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService implements IFacilityService{
    @Autowired
    private IFacilityRepository facilityRepository;

    @Override
    public List<Facility> findAll() {
        return facilityRepository.findAll();
    }
}
