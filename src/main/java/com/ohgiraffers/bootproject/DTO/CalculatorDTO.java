package com.ohgiraffers.bootproject.DTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CalculatorDTO {
    private int num1;
    private int num2;
    private int sum;

    public CalculatorDTO(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}