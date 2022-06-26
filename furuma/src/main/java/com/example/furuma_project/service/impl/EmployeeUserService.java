package com.example.furuma_project.service.impl;

import com.example.furuma_project.model.EmployeeUser;
import com.example.furuma_project.repository.IEmployeeUserRepository;
import com.example.furuma_project.service.IEmployeeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeUserService implements IEmployeeUserService {
    @Autowired
    private IEmployeeUserRepository employeeUserRepository;

    @Override
    public List<EmployeeUser> findAll () {
        return employeeUserRepository.findAll();
    }

    @Override
    public void save (EmployeeUser employeeUser) {
        employeeUserRepository.save(employeeUser);
    }
}
