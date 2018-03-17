package com.aop.impl;

import org.springframework.stereotype.Component;

@Component
public class AtithmeticCalculatorImpl implements AtithmeticCalculator {
    @Override
    public int add(int i, int j) {
        System.out.println("The method add begins with["+i+"]");
        int result  = i+j;
        return  result;
    }

    @Override
    public int sub(int i, int j) {

        System.out.println("The method sub begins with["+i+"]");
        int result  = i-j;
        return  result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("The method mul begins with["+i+"]");
        int result  = i*j;
        return  result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("The method div begins with["+i+"]");
        int result  = i/j;
        return  result;
    }
}
