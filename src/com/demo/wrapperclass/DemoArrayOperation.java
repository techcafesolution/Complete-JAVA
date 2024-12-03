package com.demo.wrapperclass;

public class DemoArrayOperation {
    private int[] num;

    public DemoArrayOperation(int[] num){
        this.num=num;
    }
     class Statistic{
         double mean(){
            double sum=0;
            for(int arr:num){
                sum+=arr;
            }
            return sum/num.length;
        }
    }
}
