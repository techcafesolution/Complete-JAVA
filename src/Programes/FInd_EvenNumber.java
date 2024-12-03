package Programes;

import java.util.Scanner;

public class FInd_EvenNumber {
    public static void main(String[] args) {
        System.out.println("Check Even Number:: ");
        System.out.println("Enter a Number:: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println(x+" is an Even Number..");
        }else{
            System.out.println(x+" is an Odd Number!!!");
        }
    }
}
