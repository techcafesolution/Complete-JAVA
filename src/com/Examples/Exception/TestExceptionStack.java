package com.Examples.Exception;

import java.util.Scanner;

public class TestExceptionStack {
    public int a(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two number:: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y==0){
            throw new ArithmeticException("Second input shouldn't be zero..");
        }else{
            return x/y;
        }
    }

    public void b(){
        a();
    }

    public void c(){
        b();
    }

    boolean d(){
        c();
        return false;
    }

    public static void main(String[] args) throws ArithmeticException,Throwable{
        TestExceptionStack tes=new TestExceptionStack();
        System.out.println(tes.d());
    }









}
