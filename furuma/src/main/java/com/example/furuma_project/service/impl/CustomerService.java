package com.example.furuma_project.service.impl;

import com.example.furuma_project.model.Customer;
import com.example.furuma_project.repository.ICustomerRepository;
import com.example.furuma_project.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll (Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public void save (Customer customer) {
        customerRepository.save(customer);
    }
}
