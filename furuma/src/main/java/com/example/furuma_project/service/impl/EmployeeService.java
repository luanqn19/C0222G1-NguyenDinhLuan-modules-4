package com.example.furuma_project.service.impl;

import com.example.furuma_project.model.Employee;
import com.example.furuma_project.repository.IEmployeeRepository;
import com.example.furuma_project.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public Page<Employee> findAll (Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public void save (Employee employee) {
        employeeRepository.save(employee);
    }
}
