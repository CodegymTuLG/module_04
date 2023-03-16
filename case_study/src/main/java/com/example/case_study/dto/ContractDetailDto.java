package com.example.case_study.dto;

import javax.persistence.*;

public class ContractDetailDto {
    private int id;
    private ContractDto contractDtoDetailId;
    private AttachFacilityDto attachFacilityDtoId;
    private int quantity;

    public ContractDetailDto() {
    }

    public ContractDetailDto(int id, ContractDto contractDtoDetailId, AttachFacilityDto attachFacilityDtoId, int quantity) {
        this.id = id;
        this.contractDtoDetailId = contractDtoDetailId;
        this.attachFacilityDtoId = attachFacilityDtoId;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ContractDto getContractDtoDetailId() {
        return contractDtoDetailId;
    }

    public void setContractDtoDetailId(ContractDto contractDtoDetailId) {
        this.contractDtoDetailId = contractDtoDetailId;
    }

    public AttachFacilityDto getAttachFacilityDtoId() {
        return attachFacilityDtoId;
    }

    public void setAttachFacilityDtoId(AttachFacilityDto attachFacilityDtoId) {
        this.attachFacilityDtoId = attachFacilityDtoId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
