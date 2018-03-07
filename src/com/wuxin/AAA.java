package com.wuxin;

public class AAA {
    public void setHeight(String height) {
        this.height = height;
    }

    private String height;
    private  BBB bbb;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private Car car;

    public AAA(String height, BBB bbb, Car car) {
        this.height = height;
        this.bbb = bbb;
        this.car = car;
    }

    public void setBbb(BBB bbb) {
        this.bbb = bbb;
     }
     public void hello(){
         System.out.println(this.height+"----"+this.bbb.getAge()+this.car.getBrand());
     }

    public AAA() {
        System.out.println("AAA的构造函数");
    }
}
