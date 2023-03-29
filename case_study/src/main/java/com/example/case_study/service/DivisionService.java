package com.example.case_study.service;

import com.example.case_study.model.Division;
import com.example.case_study.repository.IDivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService {
    @Autowired
    private IDivisionRepository res;

    @Override
    public List<Division> findAll() {
        return res.findAll();
    }
}
