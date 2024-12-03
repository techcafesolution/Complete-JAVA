package com.demo.Inheritance;

public class SampleVehicle {
    private final String property="tier";
    private int noOfTier;
    protected void setNoOfTier(int tier){
        this.noOfTier=tier;
    }
    void actionOfTier(){
        System.out.println("Vehicle must be run from place A to B by using :: "+property);
    }
}
