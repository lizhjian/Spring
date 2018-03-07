package com.wuxin.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        /*Person person = (Person) ctx.getBean("person3");
        System.out.println(person.toString());*/
        /*DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource.toString());*/
       /*Car car = ctx.getBean(Car.class);
        System.out.println(car.toString());*/
        Person person = (Person) ctx.getBean("person4");
        System.out.println(person.toString());
    }
}
