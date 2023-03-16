package com.example.case_study.dto;

import javax.persistence.*;

@Entity
public class ContractDto {
    @Id
    private int id;
    private String facitity;
    private String startdate;
    private String enddate;
    private Integer deposit;
    private Integer payment;
    private String customer;

    public ContractDto() {
    }

    public ContractDto(int id, String facitity, String startdate, String enddate, Integer deposit, Integer payment, String customer) {
        this.id = id;
        this.facitity = facitity;
        this.startdate = startdate;
        this.enddate = enddate;
        this.deposit = deposit;
        this.payment = payment;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacitity() {
        return facitity;
    }

    public void setFacitity(String facitity) {
        this.facitity = facitity;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
