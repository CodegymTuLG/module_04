package com.example.case_study.service;

import com.example.case_study.model.AttachFacility;
import com.example.case_study.repository.IAttachFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AttachFacilityService implements IAttachFacilityService{
    @Autowired
    private IAttachFacilityRepository attachFacilityRepository;
    @Override
    public List<AttachFacility> findAll() {
        return attachFacilityRepository.findAll();
    }

    @Override
    public List<AttachFacility> getContractDetailbyContractId(int contract_id) {
        return attachFacilityRepository.getContractDetailbyContractId(contract_id);
    }
}