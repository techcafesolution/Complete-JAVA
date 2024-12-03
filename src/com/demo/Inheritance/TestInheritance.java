package com.demo.Inheritance;

public class TestInheritance extends SampleBike{
    public static void main(String[] args) {
        SampleBike sb=new SampleBike();
        sb.actionOfTier();
        sb.Balancing();
        sb.running();
        System.out.println("=============");
        SampleTwoWheeler stw=new SampleTwoWheeler();
        stw.actionOfTier();
        stw.Balancing();
        System.out.println("=============");
        SampleVehicle sv=new SampleVehicle();
        sv.actionOfTier();
    }
}
