package com.example.case_study.model;

import javax.persistence.*;

@Entity
public class UserRole {
    @Id
    private int id;
    @ManyToOne
    @JoinColumn(name = "roleId",referencedColumnName = "roleId")
    private Role roleId;
    @ManyToOne
    @JoinColumn(name = "userName",referencedColumnName = "userName")
    private User userName;

    public UserRole() {
    }

    public UserRole(Role roleId, User userName) {
        this.roleId = roleId;
        this.userName = userName;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }
}
