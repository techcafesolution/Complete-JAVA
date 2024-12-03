package Module_1;

import java.util.Scanner;

public class Swap_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:: ");
        int x=sc.nextInt();
        System.out.println("Enter Second Number:: ");
        int y=sc.nextInt();
        System.out.println("Before Swapping:: ");
        System.out.println("X=> "+x);
        System.out.println("Y=> "+y);
        x=(x+y);
        y=x-y;
        x=x-y;
        System.out.println("After Swapping:: ");
        System.out.println("X=> "+x);
        System.out.println("Y=> "+y);
    }
}
