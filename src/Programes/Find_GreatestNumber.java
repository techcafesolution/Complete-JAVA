package Programes;

import java.util.Scanner;

public class Find_GreatestNumber {
    public static void main(String[] args) {
        System.out.println("Display Greatest Number Among of Three:: ");
        System.out.println("Enter First Number:: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter Second Number:: ");
        int y=sc.nextInt();
        System.out.println("Enter Third Number:: ");
        int z=sc.nextInt();
        int greater=(x>y)?x:y;
        int greatest=(greater>z)?greater:z;
        System.out.println("Greatest Number is:: "+greatest);
    }
}
