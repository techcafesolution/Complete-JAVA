package com.Examples.Exception;

import java.util.Scanner;

public class SampleTryCatch {
    public static void main(String[] args) {
        System.out.println("Welcome to know Exception..");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Two Numbers:: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
        try {
            String str="Sanjeeb";
            System.out.println(str.charAt(10));
            int[] num=new int[5];
            num[6]=9;
            int result=x/y;
            System.out.printf("Your Result is %d", result);
        }catch (ArithmeticException ex){
            System.out.println("Please check the second Inputs "+ex.getMessage());
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Please check the input "+ex.getLocalizedMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
