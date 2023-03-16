package com.example.case_study.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FacilityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "facilityTypeId")
    private Set<Facility> setFacilityTypeId;

    public FacilityType() {
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

    public Set<Facility> getSetFacilityTypeId() {
        return setFacilityTypeId;
    }

    public void setSetFacilityTypeId(Set<Facility> setFacilityTypeId) {
        this.setFacilityTypeId = setFacilityTypeId;
    }
}
