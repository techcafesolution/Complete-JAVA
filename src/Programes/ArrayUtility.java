package Programes;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] takeUserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size:: ");
        int size=sc.nextInt();
        int[] nums=new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter "+(i+1)+" No:: ");
            nums[i]=sc.nextInt();
            i++;
        }
        return nums;
    }

    public static void displayArray(int[] arr){
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
    }

    public static int[][] takeUserInput2DArray(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row Value:: ");
        int row=sc.nextInt();
        System.out.print("Enter Column Value:: ");
        int col=sc.nextInt();
        int[][] num= new int[row][col];
        for(int i=0; i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print("Enter value for Row No. "+i+" and Column No. "+j+" :: ");
                num[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        return num;
    }

    public static void display2DArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
