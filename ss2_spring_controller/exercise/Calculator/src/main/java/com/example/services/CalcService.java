package com.example.services;

import com.example.repository.ICalcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcService implements ICalcService {
    @Autowired
    ICalcRepository calcRepository;

    @Override
    public Double calculator (double num1 , double num2, String operator) {
        if (operator.equals("div") && num2 == 0) {
            return null;
        }
        return calcRepository.calculator(num1, num2, operator);
    }
}
