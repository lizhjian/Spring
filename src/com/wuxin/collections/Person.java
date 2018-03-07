package com.wuxin.collections;

import java.util.List;

public class Person {
    private String age;
    private List<Car> cars;

    public Person(String age, List<Car> cars) {
        this.age = age;
        this.cars = cars;
    }

    public Person() {
    }

    public String getAge() {

        return age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age='" + age + '\'' +
                ", cars=" + cars +
                '}';
    }
}
