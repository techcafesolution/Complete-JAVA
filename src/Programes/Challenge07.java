package Programes;

import java.util.Random;
import java.util.Scanner;

public class Challenge07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Factorial is:: "+factor());
        //System.out.println("Factorial is:: "+getFactorial(10));
        //passwordChecker();
        //numberGuess();
        //displayTable(12);
        //checkPrimeNumber(9);
        //findMax();
        //findOccurrence();
        System.out.print("Enter no of loop:: ");
        int count=sc.nextInt();
        for(int i=1;i<=count;i++){
            System.out.print(printFibonacci(i)+" ");
        }
    }
    public static int factor(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:: ");
        int num=sc.nextInt();
        int fact=num;
        for(int i=1;i<num;i++){
            fact*=i;
        }
        return fact;
    }
    public static int getFactorial(int num){
        if(num==1){
            return 1;
        }
        return num*getFactorial(num-1);
    }
    public static void passwordChecker(){
        Scanner sc=new Scanner(System.in);
        String password=null;
        String p="Sanjeeb123";
        do{
            System.out.print("Please Enter Correct Password:: ");
             password=sc.nextLine();
        }while(!p.equals(password));
        System.out.println("Password Matched!!!");
    }
    public static void numberGuess(){
        Scanner sc=new Scanner(System.in);
        Random rn=new Random();
        int x=rn.nextInt(1,10);
        int y=0;
        do{
            System.out.print("Enter you Number:: ");
            y=sc.nextInt();
        }while (x!=y);
        System.out.println("Number Matched!!");
    }
    public static void displayTable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
    public static void checkPrimeNumber(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(num+" is a Prime Number.");
        }else{
            System.out.println(num+" is not a Prime Number.");
        }
    }
    public static void findMax(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an Array:: ");
        int size=sc.nextInt();
        int[] num=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter number for index "+i+" : ");
            num[i]=sc.nextInt();
        }
        int temp=0;
        for(int n:num){
            if(temp<n){
                temp=n;
            }
        }
        System.out.println("Max no of Array is:: "+temp);
    }
    public static void findOccurrence(){
        Scanner sc=new Scanner(System.in);
        int[] num=ArrayUtility.takeUserInput();
        System.out.print("Enter a number which you want to search:: ");
        int temp= sc.nextInt();
        int count=0;
        for(int n:num){
            if(temp==n){
                count++;
            }
        }
        System.out.println("Number of occurrence of "+temp+"-->"+count+" times.");
    }
    public static int printFibonacci(int position){
        if(position==1){
            return 0;
        }
        if(position==2){
            return 1;
        }
        return printFibonacci(position-1)
                + printFibonacci(position-2);
    }

}
