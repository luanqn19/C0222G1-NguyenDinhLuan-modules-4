package com.example.furuma_project.service.impl;

import com.example.furuma_project.model.EmployeeEducation;
import com.example.furuma_project.repository.IEmployeeEducationRepository;
import com.example.furuma_project.service.IEmployeeEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeEducationService implements IEmployeeEducationService {
    @Autowired
    private IEmployeeEducationRepository employeeEducationRepository;


    @Override
    public List<EmployeeEducation> findAll () {
        return employeeEducationRepository.findAll();
    }

    @Override
    public void save (EmployeeEducation employeeEducation) {
        employeeEducationRepository.save(employeeEducation);
    }
}
