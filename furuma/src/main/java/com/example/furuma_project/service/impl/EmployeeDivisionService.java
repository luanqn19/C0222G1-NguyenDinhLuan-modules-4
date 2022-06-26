package com.example.furuma_project.service.impl;

import com.example.furuma_project.model.EmployeeDivision;
import com.example.furuma_project.repository.IEmployeeDivisionRepository;
import com.example.furuma_project.service.IEmployeeDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeDivisionService implements IEmployeeDivisionService {
    @Autowired
    private IEmployeeDivisionRepository employeeDivisionRepository;

    @Override
    public List<EmployeeDivision> findAll () {
        return employeeDivisionRepository.findAll();
    }

    @Override
    public void save (EmployeeDivision employeeDivision) {
        employeeDivisionRepository.save(employeeDivision);
    }
}
