package com.demo.Polymorphism;

public class Overloading {
    public void add(int x, int y){
        System.out.println(x+y);
    }

    public void add(int x, int y, int z){
        System.out.println(x+y+z);
    }

    public void add(String str1, String str2){
        System.out.println(str1+str2);//Operator Overloading
    }

//    public int add(int x, int y){
//        return x+y;
//    }

//    public String add(String str1, String str2){
//        return str1+str2;
//    }

    public static void main(String[] args) {
        Overloading ol=new Overloading();
        ol.add(10,12);
        ol.add(24,45,23);
        ol.add("Hi","Bye");
    }
}
