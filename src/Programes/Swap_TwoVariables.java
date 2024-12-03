package Programes;

import java.util.Scanner;

public class Swap_TwoVariables {
    public static void main(String[] args) {
        System.out.println("Welcome to Swap Variable...");
        System.out.println("Enter First Number:: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter Second Number:: ");
        int y=sc.nextInt();
        System.out.println("Before Swapping:: \n");
        System.out.println("X: "+x);
        System.out.println("Y: "+y);
        System.out.println("After Swapping:: \n");
        x=(x+y);
        y=x-y;
        x=x-y;
        System.out.println("X: "+x);
        System.out.println("Y: "+y);
    }
}
