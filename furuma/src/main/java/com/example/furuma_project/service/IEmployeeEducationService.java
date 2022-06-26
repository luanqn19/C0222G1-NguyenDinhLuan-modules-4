package com.example.furuma_project.service;

import com.example.furuma_project.model.EmployeeEducation;

import java.util.List;

public interface IEmployeeEducationService {
    List<EmployeeEducation> findAll();

    void save (EmployeeEducation employeeEducation);
}
