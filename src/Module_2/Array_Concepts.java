package Module_2;

import java.util.Scanner;

public class Array_Concepts {
    public static void main(String[] args) {
        /**
         * In Java Array is used to store multiple data.
         * Two type of array present in java.
         * 1.Single dimensional array
         * 2. Multi dimensional array
         */
        int[] numbers=new int[10];
        numbers[0]=12;
        numbers[1]=23;
        numbers[2]=34;
        numbers[3]=45;
        numbers[4]=57;
        numbers[5]=68;
        numbers[6]=79;
        numbers[7]=84;
        numbers[8]=48;
        numbers[9]=94;
        //TO print the data by using for-each loop
        for(int print:numbers){
            System.out.print(print+" ");
        }
        System.out.println();
        //Fetch data from an Array by using for loop called Array traversing.
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+", ");
        }
        System.out.println();
        //Take data from user input.
       // String[] words=takeName();
        System.out.println("===========");
        //Print data from an array
        //printArray(words);
        System.out.println("===========");
        //Different way of declaring array
        Object[] obj={2,"Sanjeev",23.98f,865794864L,'A',true};
        for(Object o:obj){
            System.out.println(o);
        }
    }
    public static String[] takeName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array:: \n");
        int size=sc.nextInt();
        String[] word=new String[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter "+i+" th word:: ");
            String name=sc.next();
            word[i]=name;
        }

        return word;
    }
    public static void printArray(String[] words){
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
    }
}
