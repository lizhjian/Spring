package com.wuxin.beans;

public class BBB {
   private  String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public BBB() {
        System.out.println("bbb的构造函数");
    }

    public BBB(String age) {
        this.age = age;
    }
}
