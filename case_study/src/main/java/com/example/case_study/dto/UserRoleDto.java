package com.example.case_study.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class UserRoleDto {
    private int id;
    private RoleDto roleDtoId;
    private UserDto userDtoName;

    public UserRoleDto() {
    }

    public UserRoleDto(RoleDto roleDtoId, UserDto userDtoName) {
        this.roleDtoId = roleDtoId;
        this.userDtoName = userDtoName;
    }

    public RoleDto getRoleId() {
        return roleDtoId;
    }

    public void setRoleId(RoleDto roleDtoId) {
        this.roleDtoId = roleDtoId;
    }

    public UserDto getUserName() {
        return userDtoName;
    }

    public void setUserName(UserDto userDtoName) {
        this.userDtoName = userDtoName;
    }
}
