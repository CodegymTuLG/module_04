package com.example.case_study.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class EmployeeDto implements Validator {
    private int id;
    private String name;
    private String birthday;
    private String cardid;
    private Double salary;
    private String phonenumber;
    private String email;
    private String address;
    private Position_Dto positionId;
    private EducationDegreeDto educationDegreeDtoId;
    private DivisionDto divisionDtoId;
    private UserDto userDtoName;

    public EmployeeDto() {
    }

    public EmployeeDto(int id, String name, String birthday, String cardid, double salary, String phonenumber, String email, String address, Position_Dto positionId, EducationDegreeDto educationDegreeDtoId, DivisionDto divisionDtoId, UserDto userDtoName) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.cardid = cardid;
        this.salary = salary;
        this.phonenumber = phonenumber;
        this.email = email;
        this.address = address;
        this.positionId = positionId;
        this.educationDegreeDtoId = educationDegreeDtoId;
        this.divisionDtoId = divisionDtoId;
        this.userDtoName = userDtoName;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
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

    public Position_Dto getPositionId() {
        return positionId;
    }

    public void setPositionId(Position_Dto positionId) {
        this.positionId = positionId;
    }

    public EducationDegreeDto getEducationDegreeId() {
        return educationDegreeDtoId;
    }

    public void setEducationDegreeId(EducationDegreeDto educationDegreeDtoId) {
        this.educationDegreeDtoId = educationDegreeDtoId;
    }

    public DivisionDto getDivisionId() {
        return divisionDtoId;
    }

    public void setDivisionId(DivisionDto divisionDto) {
        this.divisionDtoId = divisionDto;
    }

    public UserDto getUserName() {
        return userDtoName;
    }

    public void setUserName(UserDto userDtoName) {
        this.userDtoName = userDtoName;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
