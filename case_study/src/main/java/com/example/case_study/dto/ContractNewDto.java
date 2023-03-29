package com.example.case_study.dto;

import com.example.case_study.model.Customer;
import com.example.case_study.model.Employee;
import com.example.case_study.model.Facility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotEmpty;
import java.sql.Date;

public class ContractNewDto implements Validator {
    private int id;
    @NotEmpty(message = "Start date is not empty!")
    private String startdate;
    @NotEmpty(message = "End date is not empty!")
    private String enddate;
    private String deposit;
    private Employee employee;
    private Customer customer;
    private Facility facility;
    @Autowired

    public ContractNewDto() {
    }

    public ContractNewDto(int id, String startdate, String enddate, String deposit, Employee employee, Customer customer, Facility facility) {
        this.id = id;
        this.startdate = startdate;
        this.enddate = enddate;
        this.deposit = deposit;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
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

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ContractNewDto contractNewDto = (ContractNewDto) target;
        String startDate = contractNewDto.getStartdate();
        String endDate = contractNewDto.getEnddate();
        String deposit = contractNewDto.getDeposit();
        String facilityFee = contractNewDto.getFacility().getFacilityFree();
        int startDateEndDate = Integer.parseInt(endDate) - Integer.parseInt(startDate);
        int payment;
        if(startDateEndDate>0){
            errors.rejectValue("startDate", "null","Ngày bắt đầu phải nhỏ hơn hoặc trong cùng ngày với ngày kết thúc hợp đồng!");
        }else if(startDateEndDate == 0){
            startDateEndDate = 1;
            payment = startDateEndDate * Integer.parseInt(facilityFee);
            if(Integer.parseInt(deposit) > payment){
                errors.rejectValue("deposit", "null","Số tiền đặt cọc phải bé hơn tổng số tiền phải thanh toán!");
            }
        }else {
            payment = startDateEndDate * Integer.parseInt(facilityFee);
            if(Integer.parseInt(deposit) > payment)
            errors.rejectValue("deposit", "null","Số tiền đặt cọc phải bé hơn tổng số tiền phải thanh toán!");
        }

    }
}
