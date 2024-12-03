package com.encapsulation.GetterSetters;

import com.demo.Oops.DemoCar;

 public class DemoGetterSetter {
    //Properties
    private String name;
    private String color;
    private int millage;
    private double fuel;
    private int wheel;

    //Constructor
    public  DemoGetterSetter(String name, String color){
        this.name=name;
        this.color=color;
        this.millage=55;
        this.fuel=100.45;
        this.wheel=5;
    }
    //Getters Method
    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getMillage(){
        return millage;
    }

    public double getFuel(){
        return fuel;
    }

    public int getWheel(){
        return wheel;
    }
    //Setters Method
    public void setName(String name){
        this.name=name;
    }

    void setColor(String color){
        this.color=color;
    }
}
