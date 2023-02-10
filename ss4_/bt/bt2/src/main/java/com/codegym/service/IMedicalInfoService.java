package com.codegym.service;

import com.codegym.model.MedicalInfo;
import org.springframework.stereotype.Service;

@Service
public interface IMedicalInfoService {
    MedicalInfo update(MedicalInfo medicalInfo);
}
