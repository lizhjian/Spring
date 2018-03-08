package com.wuxin.propertiesFile;

import com.wuxin.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class propertiesFile {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");
        Car car =  (Car) ctx.getBean("car");
        System.out.println(car.toString());
    }
}
