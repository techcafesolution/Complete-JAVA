package Programes;

import java.util.Scanner;

public class Challenges08 {
    public static void main(String[] args) {
//        stringFormat("Apple","Dog");
//        System.out.println();
//        diceGame();
        guessingNumber();
    }
    static void diceGame(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of roll:: ");
        int roll=sc.nextInt();
        for(int i=1;i<=roll;i++){
            int act=(int)Math.ceil(Math.random()*6);
            System.out.printf("For roll %d dice is showing:: %d",i,act);
            System.out.println();
        }
    }
    static void stringFormat(String str1, String str2){
        System.out.printf("First String is %S and Second String is %S",str1,str2);
    }
    static void guessingNumber(){
        System.out.println("Welcome to Guessing Game.....");
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter a loop number:: ");
        int loop=sc.nextInt();
        System.out.println("Please remember your number range should in between 10");
        int num=(int) Math.round(Math.random()*10);
        int count=0;
        for(int i=1;i<=loop;i++){
            System.out.printf("Enter a number for loop %d:: ",i);
            int ynum=sc.nextInt();
            if(ynum>num){
                System.out.println("Please enter a small number...");
                count++;
            }else if(ynum<num){
                System.out.println("Please enter a large number...");
                count++;
            }else{
                System.out.println("Your number is Matched!!");
                count--;
                break;
            }
        }
        if(count<loop){
            System.out.println("Congrats!!! You own the game...");
        }else{
            System.out.println("Sorry your loop has finished and you loosed!!!");
        }

    }
}
class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        StringBuilder sbd=new StringBuilder();
        sbd.append("My name is:: "+name);
        sbd.append(" and My age is:: "+age);
        return sbd.toString();
    }

    public static void main(String[] args) {
        Student atd=new Student("Sanjeeb",31);
        System.out.println(atd.toString());
    }
}

class Circle{
    float diameter;
    float radius;
    public final float PI=(float) Math.PI;
    float circumference;
    float area;

    public Circle(float diameter, float radius) {
        this.diameter = diameter;
        this.radius = radius;
    }

    float calculateArea(){
        return (float) (PI*Math.pow(radius,2));
    }
    float calculateCircumference(){
        return 2*PI*radius;
    }

    public static void main(String[] args) {
        Circle cir=new Circle(5.24f, 5.2f);
        System.out.printf("Area of Circle is:: %5f",cir.calculateArea());
        System.out.println();
        System.out.printf("Circumference of Circle is:: %5f",cir.calculateCircumference());
    }

}

class ImmutableCar{
     final String name;
     final int noOfWheel;
     final String color;

     ImmutableCar(String name, int noOfWheel, String color){
         this.name=name;
         this.noOfWheel=noOfWheel;
         this.color=color;
         //noOfWheel++;
     }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ImmutableCar{");
        sb.append("name='").append(name).append('\'');
        sb.append(", noOfWheel=").append(noOfWheel);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        ImmutableCar imCar=new ImmutableCar("TATA",4,"BLUE");
        System.out.println(imCar.toString());
    }
}
