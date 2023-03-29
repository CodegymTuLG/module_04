package com.example.case_study.controller;

import com.example.case_study.dto.ContractNewDto;
import com.example.case_study.model.Contract;
import com.example.case_study.service.IContractService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ContractResController {
    @Autowired
    private IContractService contractService;

    @PostMapping("/registerNewContract")
    public ResponseEntity<?> save(@Validated @RequestBody ContractNewDto contractDto, BindingResult bindingResult){
//        new ContractNewDto().validate(contractDto, bindingResult);
//        if (bindingResult.hasFieldErrors()){
//            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
//        }
        Contract contract = new Contract();
        if(Objects.equals(contractDto.getEnddate(), "") || Objects.equals(contractDto.getStartdate(), "")){
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        BeanUtils.copyProperties(contractDto,contract);
        contractService.save(contract);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
