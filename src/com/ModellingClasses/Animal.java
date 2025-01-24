package com.ModellingClasses;

public class Animal {

    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String sound() {
        return null;
    }


    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }
}



class Dog extends Animal {

    // Constructor
    public Dog(String name, int age) {
        super(name, age);
    }


    @Override
    public String sound() {
        return "Bark";
    }
}


class Cat extends Animal {

    // Constructor
    public Cat(String name, int age) {
        super(name, age);
    }

}
