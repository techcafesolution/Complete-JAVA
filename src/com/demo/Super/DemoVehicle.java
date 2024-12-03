package com.demo.Super;

public abstract class DemoVehicle {
    private int noOftier;

    DemoVehicle(){
        this.noOftier=4;
    }
    DemoVehicle(int noOftier){
        this.noOftier=noOftier;
    }
    public abstract void start();

    public void start(int tier){
        System.out.println("Number of tier is "+tier);
    }

    public int getNoOftier(){
        return 4;
    }
}
