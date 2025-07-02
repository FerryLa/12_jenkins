package com.ohgiraffers.jenkins.service;

import com.ohgiraffers.jenkins.dto.CalculatorDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorServiceTest {


    @Autowired
    private CalculatorService calculatorService;

    private static Stream<Arguments> provideDtoSource(){
        return Stream.of(
                Arguments.of(new CalculatorDto(1,2)),
                Arguments.of(new CalculatorDto(3,5)),
                Arguments.of(new CalculatorDto(10,-2))
        );
    }

    @DisplayName("두 수의 합 구하기 테스트")
    @ParameterizedTest
    @MethodSource("provideDtoSource")
    void testTwoNumbers(CalculatorDto input) {
        int expected = input.getNum1() + input.getNum2();
        int actual = calculatorService.plusTwoNumbers(input);
        assertEquals(expected, actual);
    }
}