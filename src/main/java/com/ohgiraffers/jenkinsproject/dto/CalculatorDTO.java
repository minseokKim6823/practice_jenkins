package com.ohgiraffers.jenkinsproject.dto;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class CalculatorDTO {
    @NonNull
    private int num1;
    @NonNull
    private int num2;
    private int sum;

}
