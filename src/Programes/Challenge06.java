package Programes;

import java.util.Scanner;

public class Challenge06 {
    public static void findMininmumNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number:: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd Number:: ");
        int num2=sc.nextInt();
        int minimum=(num1<num2)?num1:num2;
        System.out.println("Minimum number is:: "+minimum);
    }

    public static void main(String[] args) {
        //findMininmumNumber();
        //checkEvenOdd(14);
        //System.out.println("Modulus is:: "+checkModulus());
        //checkStudentsMark();
        //System.out.println("Month is:: "+checkMonthOfYear());
        displayCalculator();
    }
    public static void checkEvenOdd(int num){
        boolean flag=(num%2==0)?true:false;
        if(flag){
                System.out.println(num+" is an Even Number");
        }else{
                System.out.println(num+" is an Odd Number");
        }
    }
    public static int checkModulus(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:: ");
        int num=sc.nextInt();
       return num=num>=0?num:-num;
    }
    public static void checkStudentsMark(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your mark:: ");
        int num=sc.nextInt();
        String result=num>=80?"High":(num>=50?"Moderate":"Low");
        System.out.println("Mark of the student is:: "+result);
    }
    public static String checkMonthOfYear(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number from 1-->12:: ");
        int num=sc.nextInt();
        String month=switch (num){
            case 1-> "January";
            case 2-> "February";
            case 3-> "March";
            case 4-> "April";
            case 5-> "May";
            case 6-> "June";
            case 7-> "July";
            case 8-> "August";
            case 9-> "September";
            case 10-> "October";
            case 11-> "November";
            case 12-> "December";
            default -> "Invalid Month";
        };
        return month;
    }
    public static void displayCalculator(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number:: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd Number:: ");
        int num2=sc.nextInt();
        System.out.print("Enter a symbol of operator:: ");
        String operator=sc.next();
        int result=switch (operator){
            case "+"-> num1 + num2;
            case "-"-> num1 - num2;
            case "*"-> num1 * num2;
            case "/"-> num1 / num2;
            default -> -1;
        };
        System.out.println("Result is:: "+result);
    }
}

