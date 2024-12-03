package com.demo.Casting;

import java.awt.*;

public class TestCasting {
    public static void main(String[] args) {
        //Normal Object Creation.
        SampleVehicle sv=new SampleVehicle();
        sv.start();
        DemoCar dc=new DemoCar();
        dc.start();
        DemoPlane dp=new DemoPlane();
        dp.start();
        //Upcasting
        SampleVehicle svCar =new DemoCar();
        svCar.start();
        //Down Casting
        DemoCar dVehicle=(DemoCar) svCar;
        dVehicle.start();
    }
}
