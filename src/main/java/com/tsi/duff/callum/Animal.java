package com.tsi.duff.callum;

public class Animal {
    private int age;
    private String name;

    public Animal() {
        age = 19;
    }

    public void animalEats() {

        System.out.println("I am eating");
    }

    public String setName(String newName) {
        name = newName;
        return name;
    }

    public int setAge() {
        return age;
    }

    public int getAge(){
        return age;
    }
}
