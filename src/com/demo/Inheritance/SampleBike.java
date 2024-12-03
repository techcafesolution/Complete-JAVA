package com.demo.Inheritance;

public class SampleBike extends SampleTwoWheeler{
    private final String name="PULSAR";
    private final String color="BLACK";

    void running(){
        System.out.printf("%13s bike is running witch color is:: %15s\n",name,color);
    }
}
