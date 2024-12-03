package com.demo.Inheritance;

public class SampleTwoWheeler extends SampleVehicle{
    private final String property="Balancing";

    SampleTwoWheeler(){
        setNoOfTier(2);
    }
    void Balancing(){
        System.out.println("Two wheeler vehicle can be:: "+property);
    }


}
