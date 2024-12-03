package com.demo.Super;

public class DemoCar extends DemoVehicle{

    private int noOfDoor;

    DemoCar(){
        super(4);
        this.noOfDoor=4;
    }

    @Override
    public void start() {
        super.start(4);
        getNoOftier();
        System.out.println("Car is Starting...");
    }

    public static void main(String[] args) {
        DemoCar dc =new DemoCar();
        dc.start();
    }
}
