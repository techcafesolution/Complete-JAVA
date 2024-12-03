package Module_1;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        arithmeticOperator();
        System.out.println("====================");
        assignmentOperator();
        System.out.println("====================");
        unaryOperator();
        System.out.println("====================");
        relationalOperator();
        System.out.println("====================");
        logicalOperator();

    }
    public static void arithmeticOperator(){
        int a=8;
        int b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
    public static void assignmentOperator(){
        int a=4;
        System.out.println(a);
        a*=4;
        System.out.println(a);
        a/=4;
        System.out.println(a);
        a+=4;
        System.out.println(a);
        a-=4;
        System.out.println(a);
        a%=3;
        System.out.println(a);
    }
    public static void unaryOperator(){
        int a=5;
        System.out.println(a);
        //Post-Increment
        System.out.println(a++);
        //Pre-Increment
        System.out.println(++a);
        //Post-decrement
        System.out.println(a--);
        //Pre-decrement
        System.out.println(--a);
        //change sign
        int b=-a;
        System.out.println(b);
        int c=-b;
        System.out.println(c);
    }
    public static void relationalOperator(){
        /**
         * There are 6 relational operators present in Java.
         * >, <, ==, !=, >=,<=.
         */
        System.out.println("Welcome to DL Portal..");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Age:: ");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("You are eligible for DL..");
        }else{
            System.out.println("Beta Cycle Chalao..");
        }
    }
    public static void logicalOperator(){
        /**
         * In Java there are 3 types of logical operators present.
         * AND && OR || NOT !
         */
        System.out.println("Welcome To Ticket Discount Portal...");
        System.out.println("Enter your Age:: ");
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        System.out.println("Choose your Gender (true/false)..");
        boolean gender=input.nextBoolean();

        if(age<=5){
            System.out.println("You got 75% discount...");
        }else if(gender){
            System.out.println("you got 50% discount...");
        }else if(age>=60 && !gender){
            System.out.println("You got 25% discount...");
        }else{
            System.out.println("Sorry no discount for you!!!");
        }
    }
}
