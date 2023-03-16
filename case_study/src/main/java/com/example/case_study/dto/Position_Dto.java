package com.example.case_study.dto;

import javax.persistence.*;
import java.util.Set;

public class Position_Dto {
    private int id;
    private String name;

    public Position_Dto() {
    }

    public Position_Dto(int id, String name) {
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
