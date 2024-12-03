package com.demo.Polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a = null;
        Cow c=new Cow();
        Tiger t=new Tiger();
        casting(c);
        casting(t);
       // casting(a);
        
    }

    public static void casting(Animal a){
        if(a instanceof Cow){
            a.eat();
        }else if(a instanceof Tiger){
            a.eat();
        }else{
            System.out.println("Abstract method calling from parent class");
            a.eat();
        }
    }
}
