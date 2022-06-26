package com.example.furuma_project.service;

import com.example.furuma_project.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService {
    Page<Employee> findAll(Pageable pageable);

    void save (Employee employee);
}
