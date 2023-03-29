package com.example.case_study.service;

import com.example.case_study.dto.AttachFacilityDto;
import com.example.case_study.model.AttachFacility;

import java.util.List;

public interface IAttachFacilityDtoService {
    List<AttachFacilityDto> getFacilityDetailDtobyContractId(int contract_id);
}
