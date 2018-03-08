package com.wuxin.cycle;

public class Car {
    public Car() {
        System.out.println("构造函数");
    }
    private  String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void  init(){
        System.out.println("初始化");
    }
    public void destroy(){
        System.out.println("销毁");
    }
}
