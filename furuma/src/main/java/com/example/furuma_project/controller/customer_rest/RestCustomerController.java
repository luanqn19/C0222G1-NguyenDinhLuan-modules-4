package com.example.furuma_project.controller.customer_rest;

import com.example.furuma_project.model.Customer;
import com.example.furuma_project.service.ICustomerService;
import com.example.furuma_project.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "customer-api")
public class RestCustomerController {
    @Autowired
    private ICustomerTypeService customerTypeService;
    @Autowired
    private ICustomerService customerService;

    @GetMapping(value = "/customer/list")
    public ResponseEntity<Page<Customer>> allCustomer (@RequestParam(value = "page", defaultValue = "0") int page) {
        return new ResponseEntity<>(customerService.findAll(PageRequest.of(page, 5)), HttpStatus.OK);
    }

    @PostMapping(value = "/customer/save")
    public ResponseEntity<Customer> createCustomer (@RequestBody Customer customer) {
        customerService.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }
}
