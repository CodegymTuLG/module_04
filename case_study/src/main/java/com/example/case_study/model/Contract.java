package com.example.case_study.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String startdate;
    private String enddate;
    private String deposit;
    @ManyToOne
    @JoinColumn(name = "employeeId",referencedColumnName = "id")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "customerId",referencedColumnName = "id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "facilityId",referencedColumnName = "id")
    private Facility facility;
    @OneToMany(mappedBy = "contractDetailId")
    private Set<ContractDetail> setContractDetailId;

    public Contract() {
    }

    public Contract(int id, String startdate, String enddate, String deposit, Employee employee, Customer customer, Facility facility, Set<ContractDetail> setContractDetailId) {
        this.id = id;
        this.startdate = startdate;
        this.enddate = enddate;
        this.deposit = deposit;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
        this.setContractDetailId = setContractDetailId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employeeId) {
        this.employee = employeeId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customerId) {
        this.customer = customerId;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facilityId) {
        this.facility = facilityId;
    }

    public Set<ContractDetail> getSetContractDetailId() {
        return setContractDetailId;
    }

    public void setSetContractDetailId(Set<ContractDetail> setContractDetailId) {
        this.setContractDetailId = setContractDetailId;
    }
}
