package com.example.case_study.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "rentTypeId")
    private Set<Facility> setRentTypeId;

    public RentType() {
    }

    public RentType(int id, String name, Set<Facility> setRentTypeId) {
        this.id = id;
        this.name = name;
        this.setRentTypeId = setRentTypeId;
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

    public Set<Facility> getSetRentTypeId() {
        return setRentTypeId;
    }

    public void setSetRentTypeId(Set<Facility> setRentTypeId) {
        this.setRentTypeId = setRentTypeId;
    }
}
