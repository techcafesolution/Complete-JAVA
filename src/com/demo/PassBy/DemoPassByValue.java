package com.demo.PassBy;

import com.sun.security.jgss.GSSUtil;

public class DemoPassByValue {
    public static void main(String[] args) {
        int x=3;
        int y=5;
        int sum =add(x,y);
        System.out.printf("Value of x is %d and y is %d ",x,y);
        System.out.println();
        System.out.println(sum);
        System.out.printf("Value of x is %d and y is %d ",x,y);
    }
    public static int add(int a, int b){
        a++;
        b++;
        return a+b;
    }
}
