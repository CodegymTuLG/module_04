package com.example.case_study.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;
    private String role_name;
    @OneToMany(mappedBy = "roleId")
    private Set<UserRole> setRoleId;

    public Role() {
    }

    public Role(int role_id, String role_name, Set<UserRole> setRoleId) {
        this.roleId = role_id;
        this.role_name = role_name;
        this.setRoleId = setRoleId;
    }

    public int getRole_id() {
        return roleId;
    }

    public void setRole_id(int role_id) {
        this.roleId = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Set<UserRole> getSetRoleId() {
        return setRoleId;
    }

    public void setSetRoleId(Set<UserRole> setRoleId) {
        this.setRoleId = setRoleId;
    }
}
