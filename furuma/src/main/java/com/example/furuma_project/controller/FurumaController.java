package com.example.furuma_project.controller;

import com.example.furuma_project.dto.CustomerGeneralDTO;
import com.example.furuma_project.model.*;
import com.example.furuma_project.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class FurumaController {
    @Autowired
    private ICustomerTypeService customerTypeService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IFacilityService facilityService;

    @GetMapping("/")
    public String home () {
        return "index";
    }

    //Customer
    @GetMapping("/customer/display")
    public String showListCustomer (@RequestParam(name = "page", defaultValue = "0") int page , Model model) {
        Page<Customer> customerList = customerService.findAll(PageRequest.of(page , 3));
        model.addAttribute("customerList" , customerList);
        return "display-customer";
    }

    @GetMapping("/customer/create")
    public String showCreateCustomer (@ModelAttribute("customer") Customer customer , Model model) {
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        model.addAttribute("customer" , customer);
        model.addAttribute("customerTypeList" , customerTypeList);
        return "create-customer";
    }

    @PostMapping("/customer/save")
    public String save (@Valid @ModelAttribute("customer") Customer customer ,
                        BindingResult result , Model model) {
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        if (result.hasErrors()) {
            model.addAttribute("customerTypeList" , customerTypeList);
            return "create-customer";
        }

        customerService.save(customer);

        model.addAttribute("customerTypeList" , customerTypeList);
        model.addAttribute("msg" , "Thêm mới thành công");
        return "customer/create";
    }

    //Employee
    @GetMapping("/employee/display")
    public String showListEmployee (@RequestParam(name = "page", defaultValue = "0") int page , Model model) {
        Page<Employee> employeeList = employeeService.findAll(PageRequest.of(page , 3));

        model.addAttribute("employeeList" , employeeList);
        return "display-employee";
    }

    //Service
    @GetMapping("/service/display")
    public String showListService (@RequestParam(name = "page", defaultValue = "0") int page , Model model) {
        Page<Facility> facilityList = facilityService.findAll(PageRequest.of(page , 3));

        model.addAttribute("facilityList" , facilityList);
        return "display-service";
    }
}