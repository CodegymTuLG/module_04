package com.example.case_study.service;

import com.example.case_study.dto.AttachFacilityDto;
import com.example.case_study.repository.IAttachFacilityDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachFacilityDtoService implements IAttachFacilityDtoService{
    @Autowired
    private IAttachFacilityDtoRepository attachFacilityDtoRepository;
    @Override
    public List<AttachFacilityDto> getFacilityDetailDtobyContractId(int contract_id) {
        return attachFacilityDtoRepository.getFacilityDetailDtobyContractId(contract_id);
    }
}
