package com.example.case_study.dto;

import javax.persistence.*;
import java.util.Set;

public class FacilityTypeDto {
    private int id;
    private String name;

    public FacilityTypeDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
