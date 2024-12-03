package com.demo.Final;

public class DemoFinal extends SampleFinal{

    DemoFinal(String room) {
        super(room);
    }

    public final void childVehicle(int vehicle){
        System.out.println("Total number of vehicle is:: "+vehicle);
    }

    public final void childVehicle(String vehicle){
        System.out.println("Child vehicle name is:: "+vehicle);
    }

    @Override
    public void getBedRoom(){
        super.color();
        System.out.println("Child bedroom is made by tiles floor...");
    }

//    @Override
//    public void color(){
//        System.out.println("Child bedroom is made by tiles floor...");
//    }

    public static void main(String[] args) {
        DemoFinal df=new DemoFinal("Bedroom");
        df.getBedRoom();
        df.childVehicle(4);
        df.childVehicle("Pulsar...");
    }
}
