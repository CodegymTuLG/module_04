package com.example.case_study.model;

import javax.persistence.*;
import java.util.Set;
@Entity
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "customerTypeId")
    private Set<Customer> setCustomerTypeId;

    public CustomerType() {
    }

    public CustomerType(int id, String name, Set<Customer> setCustomerTypeId) {
        this.id = id;
        this.name = name;
        this.setCustomerTypeId = setCustomerTypeId;
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

    public void setName(String type) {
        this.name = type;
    }

    public Set<Customer> getSetCustomerTypeId() {
        return setCustomerTypeId;
    }

    public void setSetCustomerTypeId(Set<Customer> setCustomerTypeId) {
        this.setCustomerTypeId = setCustomerTypeId;
    }
}
