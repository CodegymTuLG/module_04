package com.example.case_study.dto;

import javax.persistence.*;
import java.util.Set;

public class FacilityDto {
    private int id;
    private String name;
    private int area;
    private double cost;
    private int maxPeople;
    private RentTypeDto rentTypeDtoId;
    private FacilityTypeDto facilityTypeDtoId;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private double poolArea;
    private int numberOfFloors;
    private String facilityFree;

    public FacilityDto() {
    }

    public FacilityDto(int id, String name, int area, double cost, int maxPeople, RentTypeDto rentTypeDtoId, FacilityTypeDto facilityTypeDtoId, String standardRoom, String descriptionOtherConvenience, double poolArea, int numberOfFloors, String facilityFree) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentTypeDtoId = rentTypeDtoId;
        this.facilityTypeDtoId = facilityTypeDtoId;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.facilityFree = facilityFree;
    }

    public int getId() {
        return id;
    }

    public void setId(int in) {
        this.id = in;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentTypeDto getRentTypeId() {
        return rentTypeDtoId;
    }

    public void setRentTypeId(RentTypeDto rentTypeDtoId) {
        this.rentTypeDtoId = rentTypeDtoId;
    }

    public FacilityTypeDto getFacilityTypeId() {
        return facilityTypeDtoId;
    }

    public void setFacilityTypeId(FacilityTypeDto facilityTypeDtoId) {
        this.facilityTypeDtoId = facilityTypeDtoId;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }
}
