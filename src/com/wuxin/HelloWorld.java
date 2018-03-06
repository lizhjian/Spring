package com.wuxin;

public class HelloWorld {

    private String name;

    public void setName(String name) {
        System.out.println("set name");
        this.name = name;
    }
    public void hello(){
        System.out.println("hello:"+name);
    }

    public HelloWorld() {
        System.out.println("helloworld's constructor");
    }
}
