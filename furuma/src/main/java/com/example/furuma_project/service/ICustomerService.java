package com.example.furuma_project.service;

import com.example.furuma_project.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    List<Customer> findAllCustomer();

    void save(Customer customer);
}
