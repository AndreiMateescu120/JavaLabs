package com.qa.model;

public class Cat extends Animal{
    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }

    @Override
    public String sayHello(){
        return "Cat says meowllo!";
    }
}
