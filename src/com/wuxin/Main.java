package com.wuxin;

import com.wuxin.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName("张三");
        helloWorld.hello();*/

        //1.创建Spring的IOC容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //helloworld 是bean的id
/*        HelloWorld helloWorld =  (HelloWorld) ctx.getBean("helloWorld");
        helloWorld.hello();*/
    }
}
