package com.example.furuma_project.service;

import com.example.furuma_project.model.EmployeeUser;

import java.util.List;

public interface IEmployeeUserService {
    List<EmployeeUser> findAll();

    void save (EmployeeUser employeeUser);
}
