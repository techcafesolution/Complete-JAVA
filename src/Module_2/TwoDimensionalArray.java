package Module_2;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //Declaring two-dimensional array.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Size:: ");
        int row=sc.nextInt();
        System.out.println("Enter Column Size:: ");
        int column=sc.nextInt();
        int[][] number=new int[row][column];
        //To write the data
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                number[i][j]= sc.nextInt();
            }
        }
        //To read the data
        for(int i=0;i<number.length;i++){
            for(int j=0;j< number[i].length;j++){
                System.out.println(number[i][j]);
            }
        }
        //3-D Matrix
        int[][][] matrix =matrixArray();
        printMatrix(matrix);
    }
    public static int[][][] matrixArray(){
        System.out.println("Welcome to Matrix Array...");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter X value:: \n");
        int x=sc.nextInt();
        System.out.println("Enter Y value:: \n");
        int y=sc.nextInt();
        System.out.println("Enter Z value:: \n");
        int z=sc.nextInt();
        int[][][] matrix=new int[x][y][z];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                for(int k=0;k<z;k++){
                    System.out.print("Enter Value:: \n");
                    matrix[i][j][k]=sc.nextInt();
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                for(int k=0;k<matrix[i][j].length;k++){
                    System.out.print(matrix[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
