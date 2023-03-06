package com.example.case_study.model;

public class CustomerType {
    private int customertype_id;
    private String type;

    public CustomerType() {
    }

    public CustomerType(int customertype_id) {
        this.customertype_id = customertype_id;
    }

    public CustomerType(int customertype_id, String type) {
        this.customertype_id = customertype_id;
        this.type = type;
    }

    public int getCustomertype_id() {
        return customertype_id;
    }

    public void setCustomertype_id(int customertype_id) {
        this.customertype_id = customertype_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
