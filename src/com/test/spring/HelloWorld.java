package com.test.spring;

/**
 * Created by Administrator on 2018/1/16.
 * @author Administrator
 */
public class HelloWorld {


    private  String name;


    public void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println("hello:" +name);
    }
}
