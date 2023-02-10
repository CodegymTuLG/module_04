package com.codegym.responsitory;

import com.codegym.model.MedicalInfo;
import org.springframework.stereotype.Repository;

@Repository
public class MedicalInfoResponsitory implements IMedicalInfoResponsitory {
    @Override
    public MedicalInfo update(MedicalInfo medicalInfo) {
        return new MedicalInfo(medicalInfo.getName(),medicalInfo.getBirthYear(),medicalInfo.isSex(),medicalInfo.getCountry(),medicalInfo.getCardId(),medicalInfo.getTransport(),medicalInfo.isSot(),medicalInfo.isHo(),medicalInfo.isKhotho(),medicalInfo.isDauhong());
    }
}
