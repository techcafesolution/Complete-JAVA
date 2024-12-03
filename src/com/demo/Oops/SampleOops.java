package com.demo.Oops;

public class SampleOops {
    /**
     * Oops in JAVA mainly contains 4 concepts:
     * 1. Encapsulation--> Hiding property of a class and providing access to the public throughout the method.
     * 2. Abstraction--> Hiding the inner functionality of a class providing implementation.
     * 3. Inheritance--> Bringing properties of a parent class a providing new implementation inside the child class.
     * 4. Polymorphism--> Defining same properties of a class with providing multiple behaviour.
     * Encapsulation-->Encapsulation can be complete with using these 3 properties.
     * 1. Package and Access Modifier
     * 2. Getters and Setters Method
     * 3.
     * Package and Access Modifier: There are 4 types of access modifier in JAVA.
     * 1. public --> Can access by same class, subclass, innerclass, same package as well as different package.
     * 2. protected--> Can access by same class, subclass, innerclass same package as well as different package but not in the inner class of outer package.
     * 3. default--> Can access by same class and same package but not in outside package.
     * 4. protected--> Can only access by the same class even not in outside class of same package.
     * Class can be defining as public and default.
     * But class members can be defining as all 4 access modifiers.
     */
    public static void main(String[] args) {
        DemoCar dc=new DemoCar("Honda","Blue",4,45.87);
        System.out.println(dc.toString());
        TestCar tc=new TestCar("Hero","Red",4,100.87);
        System.out.println(tc.toString());
    }
}
