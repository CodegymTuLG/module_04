package com.example.case_study.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AttachFacilityDto {
    @Id
    private int id;
    private String name;
    private Double cost;
    private String unit;
    private Integer quantity;

    public AttachFacilityDto() {
    }

    public AttachFacilityDto(int id, String name, double cost, String unit, Integer quantity) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.unit = unit;
        this.quantity = quantity;
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

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer status) {
        this.quantity = status;
    }
}
