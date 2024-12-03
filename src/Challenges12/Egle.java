package Challenges12;

public class Egle extends Birds{
    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void name() {
        System.out.println("Egle is...");
    }

    public static void main(String[] args) {
        Egle e=new Egle();
        e.name();
        e.fly();
    }
}
