package com.demo.Abstraction;

public class SampleCar extends SampleVehicle {
    private int noOfDoors;

    SampleCar(int noOfDoors){
        super(4);
        this.noOfDoors=noOfDoors;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    @Override
    public void startSound(){
        System.out.println("Vrooommm...");
    }

    @Override
    public void getSetGo() {
        System.out.println("Ready to go....");
    }
}
