package com.example.case_study.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    private String userName;
    @OneToMany(mappedBy = "userName")
    private Set<Employee> setUserName;
    @OneToMany(mappedBy = "userName")
    private Set<UserRole> setUserNameRole;
    private String password;

    public User() {
    }

    public User(String userName, Set<Employee> setUserName, Set<UserRole> setUserNameRole, String password) {
        this.userName = userName;
        this.setUserName = setUserName;
        this.setUserNameRole = setUserNameRole;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<Employee> getSetUserName() {
        return setUserName;
    }

    public void setSetUserName(Set<Employee> setUserName) {
        this.setUserName = setUserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<UserRole> getSetUserNameRole() {
        return setUserNameRole;
    }

    public void setSetUserNameRole(Set<UserRole> setUserNameRole) {
        this.setUserNameRole = setUserNameRole;
    }
}
