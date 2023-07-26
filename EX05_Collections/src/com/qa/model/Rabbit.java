package com.qa.model;

public class Rabbit extends Animal{
    public Rabbit(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }

    @Override
    public String sayHello(){
        return "Rabbit says hello in a rabbitish way!";
    }
}
