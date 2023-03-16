package com.example.case_study.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String birthday;
    private String cardid;
    private double salary;
    private String phonenumber;
    private String email;
    private String address;
    @ManyToOne
    @JoinColumn(name = "positionId",referencedColumnName = "id")
    private Position_ positionId;
    @ManyToOne
    @JoinColumn(name = "educationDegreeId",referencedColumnName = "id")
    private EducationDegree educationDegreeId;
    @ManyToOne
    @JoinColumn(name = "divisionId",referencedColumnName = "id")
    private Division divisionId;
    @ManyToOne
    @JoinColumn(name = "userName",referencedColumnName = "userName")
    private User userName;
    @OneToMany(mappedBy = "employeeId")
    private Set<Contract> setEmployeeId;

    public Employee() {
    }

    public Employee(int id, String name, String birthday, String cardid, double salary, String phonenumber, String email, String address, Position_ positionId, EducationDegree educationDegreeId, Division divisionId, User userName, Set<Contract> setEmployeeId) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.cardid = cardid;
        this.salary = salary;
        this.phonenumber = phonenumber;
        this.email = email;
        this.address = address;
        this.positionId = positionId;
        this.educationDegreeId = educationDegreeId;
        this.divisionId = divisionId;
        this.userName = userName;
        this.setEmployeeId = setEmployeeId;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
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

    public Position_ getPositionId() {
        return positionId;
    }

    public void setPositionId(Position_ positionId) {
        this.positionId = positionId;
    }

    public EducationDegree getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(EducationDegree educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public Division getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Division division) {
        this.divisionId = division;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }

    public Set<Contract> getSetEmployeeId() {
        return setEmployeeId;
    }

    public void setSetEmployeeId(Set<Contract> setEmployeeId) {
        this.setEmployeeId = setEmployeeId;
    }
}
