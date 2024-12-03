package com.demo.Abstraction;

public abstract class SampleVehicle implements Transport{
    private int noOFWheel;

    public abstract void startSound();

    public SampleVehicle(int noOFWheel) {
        this.noOFWheel = noOFWheel;
    }

    public int getNoOFWheel() {
        return noOFWheel;
    }

    public void setNoOFWheel(int noOFWheel) {
        this.noOFWheel = noOFWheel;
    }

    public void commute(){
        System.out.println("Vehicle can commute....");
    }
}
