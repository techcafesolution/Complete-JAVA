package com.demo.Polymorphism;


public class TestOverriding extends SampleOverriding{

    TestOverriding(int noOfAnimal) {
        super(noOfAnimal);
    }

    @Override
    public void mainSound() {
        super.mainSound();
        System.out.println("Child Sound...");
    }

    @Override
    public void getSound(){
        super.getSound();
        System.out.println("Access sound...");
    }

    public static void main(String[] args) {
        TestOverriding to=new TestOverriding(4);
        to.getSound();
        to.mainSound();

    }
}
