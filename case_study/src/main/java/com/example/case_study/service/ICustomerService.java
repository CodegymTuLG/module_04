package com.example.case_study.service;

import com.example.case_study.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}