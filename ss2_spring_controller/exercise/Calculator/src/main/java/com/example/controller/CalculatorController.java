package com.example.controller;

import com.example.services.ICalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    ICalcService calcService;

    @GetMapping("/calculate")
    public String calc (
            @RequestParam(value = "num1") double num1 ,
            @RequestParam("num2") double num2 ,
            @RequestParam("operator") String operator ,
            Model model
    ) {
        Double result = calcService.calculator(num1 , num2 , operator);
        model.addAttribute("num1" , num1);
        model.addAttribute("num2" , num2);
        if (result == null) {
            model.addAttribute("result" , "Không thể chia cho 0");
            return "calculate";
        } else {
            model.addAttribute("result" , result);
            return "calculate";
        }
    }
}
