package com.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//把这个类声明为一个切面：需要把该类放入到IOC容器中，再声明一个切面

public class ValidationAspect {

    public void validateAspect(JoinPoint joinPoint){

        System.out.println("Validate方法...");
    }
}
