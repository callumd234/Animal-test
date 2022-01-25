package com.tsi.duff.callum;
public class Cat extends com.tsi.duff.callum.Mammal {

    private int age;
    private String awake;
    private String sleep;

    public void setCatAge(int age){
        this.age = age;
    }

    public int getCatAge(){
        return age;
    }

    public String setSleep(){
        return "I am asleep";
    }

    public String whatTheCatisEating(){
        return "I am eating tuna";
    }
    }
