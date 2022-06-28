package com.example.furuma_project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "vai_tro_nguoi_dung")
public class RoleUser {
    @ManyToOne
    @JoinColumn(name = "vai_tro_id")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "ten_nguoi_dung")
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
