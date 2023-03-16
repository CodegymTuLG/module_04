package com.example.case_study.dto;

import javax.persistence.*;
import java.util.Set;

public class RoleDto {
    private int roleId;
    private String role_name;
    public RoleDto() {
    }

    public RoleDto(int role_id, String role_name) {
        this.roleId = role_id;
        this.role_name = role_name;
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
}
