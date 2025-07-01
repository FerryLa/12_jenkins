package com.ohgiraffers.jenkins.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CalculatorDto {

    private final Integer num1;
    private final Integer num2;
    private Integer sum;

    public CalculatorDto(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

}
