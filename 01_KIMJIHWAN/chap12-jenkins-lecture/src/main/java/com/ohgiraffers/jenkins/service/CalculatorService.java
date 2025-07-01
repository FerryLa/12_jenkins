package com.ohgiraffers.jenkins.service;


import com.ohgiraffers.jenkins.dto.CalculatorDto;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plusTwoNumbers(CalculatorDto calculatorDto) {
        return calculatorDto.getNum1() + calculatorDto.getNum2();
    }
}
