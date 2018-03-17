package com.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

//把这个类声明为一个切面：需要把该类放入到IOC容器中，再声明一个切面
@Order(1)
@Aspect
@Component
public class ValidationAspect {
  //  @Before("execution(public  int com.aop.impl.AtithmeticCalculatorImpl.*(..))")
    @Before("LoggingAspect.declareJointPointExpression()")
    public void validateAspect(JoinPoint joinPoint){

        System.out.println("Validate方法...");
    }
}
