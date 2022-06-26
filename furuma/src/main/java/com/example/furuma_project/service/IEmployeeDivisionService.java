package com.example.furuma_project.service;

import com.example.furuma_project.model.EmployeeDivision;

import java.util.List;

public interface IEmployeeDivisionService {
    List<EmployeeDivision> findAll();

    void save (EmployeeDivision employeeDivision);
}
