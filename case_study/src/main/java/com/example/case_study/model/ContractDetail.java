package com.example.case_study.model;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "contractId",referencedColumnName = "id")
    private Contract contractDetailId;
    @ManyToOne
    @JoinColumn(name = "attachFacilityId",referencedColumnName = "id")
    private AttachFacility attachFacilityId;
    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(int id, Contract contractDetailId, AttachFacility attachFacilityId, int quantity) {
        this.id = id;
        this.contractDetailId = contractDetailId;
        this.attachFacilityId = attachFacilityId;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contract getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(Contract contractId) {
        this.contractDetailId = contractId;
    }

    public AttachFacility getAttachFacilityId() {
        return attachFacilityId;
    }

    public void setAttachFacilityId(AttachFacility attachFacilityId) {
        this.attachFacilityId = attachFacilityId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
