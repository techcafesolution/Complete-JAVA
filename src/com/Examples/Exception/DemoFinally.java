package com.Examples.Exception;

public class DemoFinally {
    public static void main(String[] args) {
        String str="Monkey";
        try{
            //str.charAt(3);
            int[] num=new int[3];
            num[5]=10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Check the index please!!!"+e.getLocalizedMessage());
        }finally {
            System.out.println("I will run always run at the last...");
        }
    }
}
