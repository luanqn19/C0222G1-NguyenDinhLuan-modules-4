package com.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CalcRepository implements ICalcRepository {
    @Override
    public Double calculator (double num1 , double num2 , String operator) {
        double result = 0;
        switch ( operator ) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "multi":
                result = num1 * num2;
                break;
            case "div":
                result = num1 / num2;
                break;
        }
        return result;
    }
}
