package Module_3;

public class StaticVsNonStatic {
    /**
     * Static variable value should define at the time of declaration.
     * Non-Static variable value can define at the time of object creation.
     * Static variable can be accessing only through static method.
     * Non-static variable can access both in static method and nonstatic method as well.
     * Static can call directly in the same class and by class name in other class.
     * Non-static variable can only access via the object of current class.
     * @param args
     */
    public static void main(String[] args) {
        Animal animal=new Animal("Tiger", 4, "Black", "Strange", 22);
        animal.animalInformation();
        Animal.animalNature();
    }
}
class Animal{
    static String nature="Cruel";
    String name;
    int leg;
    String color;
    String sound;
    int age;
    Animal(String name, int leg, String color, String sound, int age){
        this.name=name;
        this.leg=leg;
        this.color=color;
        this.sound=sound;
        this.age=age;
    }
    public void animalInformation(){
        System.out.println("Name of animal is:: "+name);
        System.out.println("No of leg of animal is:: "+leg);
        System.out.println("Color of animal is:: "+color);
        System.out.println("Age of animal is:: "+age);
    }
    public static void animalNature(){
        System.out.println("Nature of this Animal is:: "+nature);
    }
}