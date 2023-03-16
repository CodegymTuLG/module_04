package com.example.case_study.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy = "divisionId")
    private Set<Employee> setDivisionId;
    private String name;

    public Division() {
    }

    public Division(int id, Set<Employee> setDivisionId, String name) {
        this.id = id;
        this.setDivisionId = setDivisionId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Employee> getSetDivisionId() {
        return setDivisionId;
    }

    public void setSetDivisionId(Set<Employee> setDivisionId) {
        this.setDivisionId = setDivisionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
