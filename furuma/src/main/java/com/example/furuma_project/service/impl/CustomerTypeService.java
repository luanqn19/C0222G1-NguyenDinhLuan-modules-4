package com.example.furuma_project.service.impl;

import com.example.furuma_project.model.CustomerType;
import com.example.furuma_project.repository.ICustomerTypeRepository;
import com.example.furuma_project.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll () {
        return customerTypeRepository.findAll();
    }
}
