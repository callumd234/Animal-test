package com.tsi.duff.callum;

public class Animal {


    ///////attributes///////////////////////////
    private int age;
    private String name;
    private int height;
    private int weight;

////////////////////////methods////////////////////////////////////////
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void gainWeight(){

    }
}
