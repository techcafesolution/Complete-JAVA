package com.demo.test.GettersSetters;

import com.encapsulation.GetterSetters.DemoGetterSetter;

public class TestGetterSetters {
    public static void main(String[] args) {
        DemoGetterSetter dgs=new DemoGetterSetter("Honda","Black");

        System.out.println(dgs.getName());
        System.out.println(dgs.getColor());
        System.out.println(dgs.getFuel());
        System.out.println(dgs.getMillage());
        System.out.println(dgs.getWheel());
        System.out.println("=============");
        dgs.setName("Tata");
        System.out.println(dgs.getName());
        System.out.println(dgs.getColor());
        System.out.println(dgs.getFuel());
        System.out.println(dgs.getMillage());
        System.out.println(dgs.getWheel());
    }
}
