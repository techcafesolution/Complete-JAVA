package Programes;

import java.util.Scanner;

public class Challenges03 {
    public static void main(String[] args) {
        //1. Write a program for multiplication table.
       // multiplicationTable(9);
        //2. Write a program for sum of all odd number.
       // int sum=sumOfAll_OddNumber(12);
       // System.out.println("Sum of all odd number is:: "+sum);
        //3. Factorial of a given number
        //System.out.println("Factorial of Number:: "+factorial(1));
        //4. Sum of digit of an integer
        //sumOFDigit(134);
        //5. Find LCM of two given number.
        //findLCM();
        //findLCM2();
        //6. Find HCF of two number.
        //findHCF();
        //7. Check Prime Number
        //if(checkPrimeNumber()) System.out.println("It is prime number..");
        //else System.out.println("It is not a prime number..");
        //8. Reverse Digit
        //System.out.println(reverseDigit(123));
        //9. Fibonacci series
        //fibonacciSeries(10);
        //10. Find Armstrong Number.
        //armstrongNumber(153);
        //11. Find Palindrome
        //palindromeNumber(121);
        //12. Check Happy Number
        //happyNumber(28);
        //13. Right Angle Triangle pattern
        //printRightAngleTriangle(5);
        //14. Reverse Right Angle Triangle pattern
        //printReverseRightAngleTriangle(5);
        //15. Left Angle Triangle pattern
        printLeftAngleTriangle(5);
    }
    public static void multiplicationTable(int table){
        int i=1;
        while(i<=table){
            System.out.println(i+" X "+table+" = "+(i*table));
            i++;
        }
    }
    public static int sumOfAll_OddNumber(int range){
        int i=1;
        int sum=0;
        while(i<=range){
            if(i%2!=0){
                sum=sum+i;
            }
            i++;
        }
        return sum;
    }
    public static int factorial(int number){
        int factor=1;
        if(number==0){
            return factor;
        }else{
            for(int i=1;i<=number;i++){
                factor=factor*i;
            }
        }
       return factor;
    }
    public static void sumOFDigit(int integer){
        int rem=0, sum=0;
        int temp=integer;
        while(temp>0){
            rem=temp%10;
            sum=sum+rem;
            temp/=10;
        }
        System.out.println("Sum of digit of integer "+integer+" is:: "+sum);
    }
    public static void findLCM(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:: ");
        int x=sc.nextInt();
        System.out.println("Enter second number:: ");
        int y=sc.nextInt();
        int com=(x>y)?x:y;
        while(true){
           if(com%x==0&&com%y==0){
               break;
           }else{
               com++;
           }
        }
        System.out.println("LCM of "+x+" and "+y+" = "+com);
    }
    public static void findLCM2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:: ");
        int x=sc.nextInt();
        System.out.println("Enter second number:: ");
        int y=sc.nextInt();
        int i=1;
        int fact;
        while(true){
          fact=x*i;
           if(fact%y==0){
               break;
           }else{
               i++;
           }
        }
        System.out.println("LCM of "+x+" and "+y+" = "+fact);
    }
    public static void findHCF(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:: ");
        int x=sc.nextInt();
        System.out.println("Enter second number:: ");
        int y=sc.nextInt();
        int com=x<y?x:y;
        while(true){
            if(x%com==0&&y%com==0){
                break;
            }else{
                com--;
            }
        }
        System.out.println("HCF of "+x+" and "+y+" is:: "+com);
    }
    public static boolean checkPrimeNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }
    public static int reverseDigit(int digit){
        int temp=digit;
        int rem=0, sum=0;
        while(temp>0){
            rem=temp%10;
            sum=(sum*10)+rem;
            temp/=10;
        }
        return sum;
    }
    public static void fibonacciSeries(int range){
        int a=0, b=1, c=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(range>0){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            range--;
        }
    }
    public static void armstrongNumber(int num){
        int temp=num;
        int rem=0, sum=0;
        while(temp>0){
            rem=temp%10;
            sum+=Math.pow(rem,3);
            temp/=10;
        }
        if(num==sum){
            System.out.println(num+" is an Armstrong Number... ");
        }else{
            System.out.println(num+" is not an Armstrong Number..");
        }
    }
    public static void palindromeNumber(int num){
        int temp=num;
        int rem=0, sum=0;
        while(temp>0){
            rem=temp%10;
            sum=(sum*10)+rem;
            temp/=10;
        }
        if(num==sum){
            System.out.println(num+" is a Palindrome Number.");
        }else{
            System.out.println(num+" is not a Palindrome Number");
        }
    }
    public static void happyNumber(int num){
        int temp=num;
        int rem=0, sum=0;
        while(true){
            while(temp>0){
                rem=temp%10;
                sum=sum+(rem*rem);
                temp/=10;
            }
            if(sum==1){
                System.out.println(num+" is a HappyNumber..");
                break;
            }else{
                temp=sum;
                sum=0;
            }
        }

    }
    public static void printRightAngleTriangle(int row){
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printReverseRightAngleTriangle(int row){
        for(int i=row;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printLeftAngleTriangle(int row){
        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print("  ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
