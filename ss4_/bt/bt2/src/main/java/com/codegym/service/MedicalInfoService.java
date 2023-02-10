package com.codegym.service;

import com.codegym.model.MedicalInfo;
import com.codegym.responsitory.IMedicalInfoResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalInfoService implements IMedicalInfoService {
    @Autowired
    IMedicalInfoResponsitory medicalInfoResponsitory;
    @Override
    public MedicalInfo update(MedicalInfo medicalInfo) {
        return medicalInfoResponsitory.update(medicalInfo);
    }
}
