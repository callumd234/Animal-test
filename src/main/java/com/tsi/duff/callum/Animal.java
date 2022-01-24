package com.tsi.duff.callum;

public abstract class Animal {
    ////////////////////////////////////Attributes///////////////////////////////////
    private int age;



    ////////////////////////////////////Constructors/////////////////////////////////






    /////////////////////////////////////Methods/////////////////////////////////////
    public abstract void eat(String food);

    public void sleep(int time){
        //this.wait(time);
    }

    public abstract Animal reproduce();

    public abstract String Breathe();

    public String excrete(){
        return "poo";
    }

    public void die(){
        //DIE
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
