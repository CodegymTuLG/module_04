package com.example.case_study.model;

public class RentType {
    private int renttype_id;
    private String type;

    public RentType() {
    }

    public RentType(int renttype_id, String type) {
        this.renttype_id = renttype_id;
        this.type = type;
    }
    public RentType(int renttype_id) {
        this.renttype_id = renttype_id;
    }

    public int getRenttype_id() {
        return renttype_id;
    }

    public void setRenttype_id(int renttype_id) {
        this.renttype_id = renttype_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
