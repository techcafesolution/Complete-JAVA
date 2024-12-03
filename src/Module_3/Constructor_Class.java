package Module_3;

import java.util.Scanner;

public class Constructor_Class {
    /**
     * Constructor is a component of java which is used to create a real object of a class.
     * Where class is just a blue-print of an object.
     * Constructors are two types 1. Default Constructor 2. User define constructor.
     * When we create an object with new keyword JVM by default create a constructor.
     * User define constructor are two types: 1. Parameterize constructor 2. Non-parameterize Constructor.
     * By using this constructor we can initialize and re-initialize non-static global variables during the object creation.
     * By using 'this' key word we can invoke global variable anywhere inside the class.
     * JVM invoke constructor before invoking main method.
     */
    public static void main(String[] args) {
        Bike b=new Bike("Pulsar","Black",6.2,5);
        b.bikeInformation();
        b.startBike();
    }
}
class Bike{
    String name;
    int wheel;
    String color;
    double fuel;
    int millage;
    Bike(String name, String color, double fuel, int millage){
        System.out.println("Constructor is running...");
        this.name=name;
        this.wheel=2;
        this.color=color;
        this.fuel=fuel;
        this.millage=millage;
    }
    public void startBike(){
        while (millage>0){
            if(checkFuel()<=5){
                refuel();
            }else{
                bikeRunning();
            }
            millage--;
        }
        System.out.println("Stop The Bike....");
    }
    public double checkFuel(){
        if(fuel==0){
            System.out.println("Fuel status is:: "+fuel);
            System.out.println("Bike can't be start!!");
        }else if(fuel<=5){
            System.out.println("Fuel status is:: "+fuel);
            System.out.println("Please refuel Bike..");
        }else{
            System.out.println("Fuel status is:: "+fuel);
            System.out.println("Happy journey..");
        }
        return fuel;
    }
    public void refuel(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Add Petrol:: ");
        this.fuel= sc.nextDouble();
        System.out.println("Bike refuel complete...");
    }
    public void bikeRunning(){
        System.out.println("Bike is in running mode..");
        this.fuel--;
        millage--;
        System.out.println("Bike millage is:: "+millage);

    }
    public void bikeInformation(){
        System.out.println("Bike name is:: "+name);
        System.out.println("Bike Color is:: "+color);
        System.out.println("Bike Wheel no is:: "+wheel);
        System.out.println("Bike millage is:: "+millage);
    }
}
