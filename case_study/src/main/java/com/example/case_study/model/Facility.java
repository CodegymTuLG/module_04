package com.example.case_study.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int area;
    private double cost;
    private int maxPeople;
    @ManyToOne
    @JoinColumn(name = "rentTypeId",referencedColumnName = "id")
    private RentType rentTypeId;
    @ManyToOne
    @JoinColumn(name = "facilityTypeId",referencedColumnName = "id")
    private FacilityType facilityTypeId;
    private String standardRoom;
    private String descriptionOtherConvenience;
    @Column(nullable=true)
    private Double poolArea;
    @Column(nullable=true)
    private Integer numberOfFloors;
    @Column(nullable=true)
    private String facilityFree;
    @OneToMany(mappedBy = "facilityId")
    private Set<Contract> setFacilityId;

    public Facility() {
    }

    public Facility(int id, String name, int area, double cost, int maxPeople, RentType rentTypeId, FacilityType facilityTypeId, String standardRoom, String descriptionOtherConvenience, double poolArea, int numberOfFloors, String facilityFree, Set<Contract> setFacilityId) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentTypeId = rentTypeId;
        this.facilityTypeId = facilityTypeId;
        this.standardRoom = standardRoom;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.facilityFree = facilityFree;
        this.setFacilityId = setFacilityId;
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

    public RentType getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(RentType rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public FacilityType getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(FacilityType facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
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

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }

    public Set<Contract> getSetFacilityId() {
        return setFacilityId;
    }

    public void setSetFacilityId(Set<Contract> setFacilityId) {
        this.setFacilityId = setFacilityId;
    }
}
