package com.qa.model;

public class Dog extends Animal{
    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }

    @Override
    public String sayHello(){
        return "Dog says oufello!";
    }
}
