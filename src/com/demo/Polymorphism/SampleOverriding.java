package com.demo.Polymorphism;

public class SampleOverriding {
    private int noOfAnimal;
    SampleOverriding(int noOfAnimal){
        this.noOfAnimal=4;
    }
    public void getSound(){
        System.out.println("Sound is undefinable...");
    }

    protected void mainSound(){
        System.out.println("Parent sound....");
    }
}
