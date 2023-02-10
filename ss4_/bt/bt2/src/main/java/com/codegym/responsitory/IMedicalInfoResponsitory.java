package com.codegym.responsitory;

import com.codegym.model.MedicalInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicalInfoResponsitory {
    MedicalInfo update(MedicalInfo medicalInfo);
}
