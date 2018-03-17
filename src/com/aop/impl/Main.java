package com.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //1、创建Spring 的IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextAop.xml");
        //2.从ioc中获取实例
        AtithmeticCalculator atithmeticCalculator =ctx.getBean(AtithmeticCalculator.class);
      //  AtithmeticCalculator atithmeticCalculator =(AtithmeticCalculator) ctx.getBean("atithmeticCalculatorImpl");
        //3 使用Bean
        /*int result = atithmeticCalculator.add(3,6);
        System.out.println(result);*/
       int result = atithmeticCalculator.div(6,1);
        System.out.println(result);
    }
}
