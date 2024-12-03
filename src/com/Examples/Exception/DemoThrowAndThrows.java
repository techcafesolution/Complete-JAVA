package com.Examples.Exception;

public class DemoThrowAndThrows {
    public static void checkCharacters(String ch, String str){
        if(!str.contains(ch)){
            throw new IllegalArgumentException("String doesn't contains "+ch);
        }else{
            System.out.println("Character is Matched!!!");
        }
    }

    public static void main(String[] args) throws Throwable{
        String name="Sanjeeb";
        checkCharacters("f",name);
    }

}
