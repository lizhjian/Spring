package com.wuxin;

public class AAA {
    public void setHeight(String height) {
        this.height = height;
    }

    private String height;
    private  BBB bbb;

    public void setBbb(BBB bbb) {
        this.bbb = bbb;
     }
     public void hello(){
         System.out.println(this.height+"----"+this.bbb.getAge());
     }

    public AAA() {
        System.out.println("AAA的构造函数");
    }
}
