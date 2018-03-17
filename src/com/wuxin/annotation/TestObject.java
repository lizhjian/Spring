package com.wuxin.annotation;

import com.wuxin.annotation.controller.UserController;
import com.wuxin.annotation.repository.UserRepository;
import com.wuxin.annotation.service.UserService;
import com.wuxin.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestObject {
    public static void main(String[] args) {
       /* ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
        System.out.println(ctx);
        TestObject testObject = (TestObject) ctx.getBean("testObject");
        System.out.println(testObject);
        UserController userController = (UserController)ctx.getBean("userController");
        System.out.println(userController);

        UserService userService = (UserService)ctx.getBean("userService");
        System.out.println(userService);

        UserRepository userRepository = (UserRepository)ctx.getBean("userRepository");
        System.out.println(userRepository);*/
       ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
     //   UserController  userController = (UserController)ctx.getBean("userController");
        UserController  userController = (UserController)ctx.getBean(UserController.class);
        System.out.println(userController);
        userController.execute();

    }
}
