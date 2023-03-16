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
    private Employee employeeId;
    @ManyToOne
    @JoinColumn(name = "customerId",referencedColumnName = "id")
    private Customer customerId;
    @ManyToOne
    @JoinColumn(name = "facilityId",referencedColumnName = "id")
    private Facility facilityId;
    @OneToMany(mappedBy = "contractDetailId")
    private Set<ContractDetail> setContractDetailId;

    public Contract() {
    }

    public Contract(int id, String startdate, String enddate, String deposit, Employee employeeId, Customer customerId, Facility facilityId, Set<ContractDetail> setContractDetailId) {
        this.id = id;
        this.startdate = startdate;
        this.enddate = enddate;
        this.deposit = deposit;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.facilityId = facilityId;
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

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    public Set<ContractDetail> getSetContractDetailId() {
        return setContractDetailId;
    }

    public void setSetContractDetailId(Set<ContractDetail> setContractDetailId) {
        this.setContractDetailId = setContractDetailId;
    }
}
