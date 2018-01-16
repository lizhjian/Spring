package com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/1/16.
 */
public class Main {

    public static  void main(String[] args){
        /*//创建helloworld的一个对象
        HelloWorld helloWorld = new HelloWorld();
        //为name属性赋值
        helloWorld.setName("myFirstproject");*/
        //1、创建spring的ioc容器对象
        ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 在IOC容器中获取Bean实例
        HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld");
        helloWorld.hello();
    }
}
