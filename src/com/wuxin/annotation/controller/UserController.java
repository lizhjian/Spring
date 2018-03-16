package com.wuxin.annotation.controller;

import com.wuxin.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller(value = "userController")
public class UserController {

    @Autowired(required = false)
    private UserService userService;
    public  void execute(){
        System.out.println("UserController  execute...");
     //   System.out.println(userService);
           userService.add();
    }
}
