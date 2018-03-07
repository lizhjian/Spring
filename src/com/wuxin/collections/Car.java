package com.wuxin.collections;

public class Car {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    private String brand;

    public Car() {
    }

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
