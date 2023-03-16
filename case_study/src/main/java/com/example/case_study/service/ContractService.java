package com.example.case_study.service;

import com.example.case_study.dto.ContractDto;
import com.example.case_study.model.AttachFacility;
import com.example.case_study.model.Contract;
import com.example.case_study.model.ContractDetail;
import com.example.case_study.repository.IContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.List;
@Service
public class ContractService implements IContractService{
    @Autowired
    IContractRepository repository;

    @Override
    public Page<ContractDto> findAllContract(Pageable pageable) {
        return repository.findAllContract(pageable);
    }

    @Override
    public void insertContract(Contract contract) {

    }

    @Override
    public List<AttachFacility> getContractDetailbyContractId(int contract_id) {
        return null;
    }

    @Override
    public void insertContractDetail(ContractDetail contractDetail) {

    }
}
