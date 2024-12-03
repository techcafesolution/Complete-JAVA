package Module_3;

public class Object_Class {
    /**
     * Here we will see what is function and attributes.
     * Function relates action/behaviour of an object.
     * Attribute relates property of an object.
     */
    public static void main(String[] args) {
        Car myCar=new Car(6,50);
       Car startCar=myCar.startCar();
        startCar.drive();
        //myCar.checkFuel();
        Animal animal=new Animal("Bear",4,"Color","Hummm", 10);
        animal.animalInformation();
        Animal.animalNature();
    }
}
class Car{
    String carName="honda";
    int noOfWheel=5;
    int fuelConsumption;
    String color="black";
    int speedRange;
    Car(int fuelConsumption, int speedRange){
        this.fuelConsumption=fuelConsumption;
        this.speedRange=speedRange;
    }
    public Car startCar() {
        System.out.println("Car is starting...");
        checkFuel();
        return this;
    }
    public void drive(){
        System.out.println("Car is driving..");
         checkSpeedRange();
         fuelConsumption--;
    }
    public void checkSpeedRange(){
        System.out.println("Speed range is:: "+speedRange);
        speedRange++;
        System.out.println(speedRange);
    }
    public double reFuelEngine(double addPetrol){
        fuelConsumption+=addPetrol;
        return fuelConsumption;
    }
    public void checkFuel(){
        if(fuelConsumption==0){
        System.out.println(fuelConsumption);
            System.out.println("Stop the Car!!");
            System.out.println("Refuel the Car!!");
        }else if(fuelConsumption<=5){
        System.out.println(fuelConsumption);
            System.out.println("Fuel is in reserve mode..");
            System.out.println("Refuel the Car!!");
        }else {
        System.out.println(fuelConsumption);
            System.out.println("Run safely...");
        }
    }
}