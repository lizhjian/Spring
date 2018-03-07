package com.wuxin.scope;

import com.wuxin.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
       /* com.wuxin.autowire.Car car =  (Car) ctx.getBean("car");
        Car car2 = (Car)ctx.getBean("car");
        System.out.println(car==car2);*/
    }
}
