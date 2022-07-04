package com.example.furuma_project.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "vai_tro_nguoi_dung")
public class RoleUser implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "vai_tro_id")
    @JsonManagedReference("role_user_role")
    private Role role;

    @Id
    @ManyToOne
    @JoinColumn(name = "ten_nguoi_dung")
    @JsonManagedReference(value = "role_user_employeeUserRole")
    private EmployeeUser employeeUserRole;

    public RoleUser () {
    }

    public RoleUser (Role role , EmployeeUser employeeUserRole) {
        this.role = role;
        this.employeeUserRole = employeeUserRole;
    }

    public Role getRole () {
        return role;
    }

    public void setRole (Role role) {
        this.role = role;
    }

    public EmployeeUser getEmployeeUserRole () {
        return employeeUserRole;
    }

    public void setEmployeeUserRole (EmployeeUser employeeUserRole) {
        this.employeeUserRole = employeeUserRole;
    }
}
