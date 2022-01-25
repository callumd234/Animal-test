package com.tsi.duff.callum;
public abstract class Mammal {

    private int size = 10;

    public String Breathe(){
        return "I am breathing";
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Mammal reproduce(){
        return new Cat();
    }
}
