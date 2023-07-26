package com.qa.model;

public abstract class Animal implements Comparable<Animal> {
    private String name;
    private Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String sayHello(){
        return "Animal says hello!";
    }

    @Override
    public int compareTo(Animal o) {
        return age - o.getAge();
    }
}
