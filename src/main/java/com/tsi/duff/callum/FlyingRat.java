package com.tsi.duff.callum;

public class FlyingRat extends Bird implements Flying{
    private String takeOff;
    private String midFlight;
    private String landing;

    public FlyingRat(){
        setWeight(300);
    }

    public String takeOffMethod(){
        takeOff = "flap wings and move legs to start flying";
        return takeOff;
    }

    public String flying(){
        midFlight = "keep flapping wings and glide through the air";
        return midFlight;
    }

    public String touchdown(){
        landing = "stop flapping wings and land gently";
        return landing;
    }

    public String getTakeOffMethod(){
        return takeOff;
    }

    public String getFlying(){
        return midFlight;
    }
    public String getTouchdown(){
        return landing;
    }




    }


