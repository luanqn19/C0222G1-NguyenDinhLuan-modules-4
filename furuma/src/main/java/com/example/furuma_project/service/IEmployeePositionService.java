package com.example.furuma_project.service;

import com.example.furuma_project.model.EmployeePosition;

import java.util.List;

public interface IEmployeePositionService {
    List<EmployeePosition> findAll();

    void save (EmployeePosition employeePosition);
}
