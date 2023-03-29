package com.example.case_study.service;

import com.example.case_study.dto.ContractDto;
import com.example.case_study.model.AttachFacility;
import com.example.case_study.model.Contract;
import com.example.case_study.model.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {
    Page<ContractDto> findAllContract(Pageable pageable);
    void save(Contract contract);
    List<AttachFacility> getContractDetailbyContractId(int contract_id);
    void insertContractDetail(ContractDetail contractDetail);
}
