package com.wuxin.annotation.controller;

import org.springframework.stereotype.Controller;

@Controller(value = "userController")
public class UserController {

    public  void execute(){
        System.out.println("UserController  execute...");
    }
}
