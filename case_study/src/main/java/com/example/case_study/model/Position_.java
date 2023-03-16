package com.example.case_study.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Position_ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy = "positionId")
    private Set<Employee> setPositionId;
    private String name;

    public Position_() {
    }

    public Position_(int id, String name) {
        this.id = id;
        this.name = name;
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
