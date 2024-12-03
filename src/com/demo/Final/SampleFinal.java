package com.demo.Final;

import com.demo.Polymorphism.SampleOverriding;

public abstract class SampleFinal {
    public static final int totalMoney;
    public String room;

    static {
        totalMoney=7363;
    }

    SampleFinal(String room){
        this.room=room;
    }

    public final void color(){
        System.out.println("Colour of parent house can't be change!!!");
    }

    public void getBedRoom(){
        System.out.println("Parent bedroom made is by normal floor....");
    }


}
