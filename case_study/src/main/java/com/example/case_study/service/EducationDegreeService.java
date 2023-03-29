package com.example.case_study.service;

import com.example.case_study.model.EducationDegree;
import com.example.case_study.repository.IEducationDegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EducationDegreeService implements IEducationDegreeService{
    @Autowired
    IEducationDegreeRepository res;

    @Override
    public List<EducationDegree> findAll() {
        return res.findAll();
    }
}
