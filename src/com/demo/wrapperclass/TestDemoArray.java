package com.demo.wrapperclass;

public class TestDemoArray {
    public static void main(String[] args) {
        DemoArrayOperation dmo=new DemoArrayOperation(new int[]{4,5,8,7});
        DemoArrayOperation.Statistic stc=dmo.new Statistic();
        System.out.println(stc.mean());
    }
}
