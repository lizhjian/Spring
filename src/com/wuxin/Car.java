package com.wuxin;

public class Car {
    private String brand;
    private  String corp;
    private  String price;
    private String maxSpeed;

    public Car(String brand, String corp, String price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price='" + price + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }
}
