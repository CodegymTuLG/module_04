package com.example.case_study.dto;

import com.example.case_study.model.CustomerType;

import javax.persistence.*;
import java.util.Set;

public class CustomerDto {
    private int id;
    private CustomerType customerTypeId;
    private String name;
    private String birthday;
    private int sex;
    private String cardid;
    private String phonenumber;
    private String email;
    private String address;

    public CustomerDto() {
    }

    public CustomerDto(int id, CustomerType customerTypeId, String name, String birthday, int sex, String cardid, String phonenumber, String email, String address) {
        this.id = id;
        this.customerTypeId = customerTypeId;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.cardid = cardid;
        this.phonenumber = phonenumber;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public com.example.case_study.model.CustomerType getCustomerType() {
        return customerTypeId;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerTypeId = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}