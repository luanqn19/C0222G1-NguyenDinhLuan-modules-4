package com.example.furuma_project.service.impl;

import com.example.furuma_project.model.EmployeePosition;
import com.example.furuma_project.repository.IEmployeePositionRepository;
import com.example.furuma_project.service.IEmployeePositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePositionService implements IEmployeePositionService {
    @Autowired
    private IEmployeePositionRepository employeePositionRepository;
    @Override
    public List<EmployeePosition> findAll () {
        return employeePositionRepository.findAll();
    }

    @Override
    public void save (EmployeePosition employeePosition) {
        employeePositionRepository.save(employeePosition);
    }
}
