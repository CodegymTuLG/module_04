package com.example.case_study.dto;

import javax.persistence.*;


public interface ContractDto {
    Integer getId();
    String getCustomer();
    String getFacility();
    String getStartDate();
    String getEndDate();
    Double getPayment();
    Double getDeposit();
}
