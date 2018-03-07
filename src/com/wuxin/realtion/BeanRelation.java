package com.wuxin.realtion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanRelation {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
    //    Address address = (Address)ctx.getBean("address");
        Address address2 = (Address)ctx.getBean("address2");
     //   System.out.println(address.toString());
        /*System.out.println(address2.toString());*/
        Person person = (Person) ctx.getBean("person");
        System.out.println(person.toString());
    }
}
