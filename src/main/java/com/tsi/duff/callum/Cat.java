package com.tsi.duff.callum;
public class Cat extends com.tsi.duff.callum.Mammal {






    /////////////////////constructors///////////////////////////////
    private int age;
    public int catWeight = 300;




    ///////////////////////Methods////////////////////////////////////////

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
        return "I am eating fish";
    }

    public void setCatWeight(){
        this.catWeight = catWeight;
    }

    public int getCatWeight(){
        return catWeight;
    }
    public void eatFood(String food) {
        if (food.equals("sausage")) {
            catWeight = 400;
        }
       else if (food.equals("fish")) {
            catWeight = 350;
        } else
            catWeight = 300;
    }

    }
