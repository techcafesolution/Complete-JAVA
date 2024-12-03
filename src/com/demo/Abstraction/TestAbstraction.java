package com.demo.Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        //SampleVehicle sv=new SampleVehicle(4);
        SampleCar sc=new SampleCar(4);
        sc.commute();
        sc.getSetGo();
        sc.startSound();
        System.out.println(Transport.TYPES);
    }
}
