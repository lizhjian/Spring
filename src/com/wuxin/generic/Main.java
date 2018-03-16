package com.wuxin.generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  UserService 中继承了父类  指定了User,  UserService 中的成员变量  BaseRepository baserepositor被自动注入了user
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-generic.xml");
        UserService userService = (UserService)ctx.getBean("userService");
        userService.add();
    }
}
