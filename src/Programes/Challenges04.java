package Programes;

import java.util.Scanner;

public class Challenges04 {
    public static void main(String[] args) {
        //1. Calculate sum and average of an Array.
//        System.out.println("Welcome to Sum and Average Program");
//        int[] num=ArrayUtility.takeUserInput();
//        System.out.println("Sum of array is:: "+sumOfArray(num));
//        System.out.println("Average of array is:: "+averageOfArray(num));
        //2. Searching a number from an Array.
//        int[] num=ArrayUtility.takeUserInput();
//        if(searchingElement(num)){
//            System.out.println("Yes, Element is present..");
//        }else{
//            System.out.println("No, Element isn't present!!");
//        }
        //3. Find the number of occurrence from the array.
//        int[] num=ArrayUtility.takeUserInput();
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter a number to check no.of Occurrence:: ");
//        int n=sc.nextInt();
//        int x=countOccurrence(num,n);
//        System.out.println("Numbers of occurrence of "+n+" is "+x+" times.");
        //4. Find min and Max value from a given array.
//        System.out.println("Welcome to Min and Max Value of an Array...");
//        int[] numArr=ArrayUtility.takeUserInput();
//        int min=minArr(numArr);
//        int max=maxArr(numArr);
//        System.out.println("Minimum value of Array is:: "+min);
//        System.out.println("Maximum value of Array is:: "+max);
        //5. Check Array is shorted or not.
//        int[] num=ArrayUtility.takeUserInput();
//        boolean increase=increasingOrder(num);
//        boolean decrease=decreasingOrder(num);
//        if(increase || decrease){
//            System.out.println("Array is shorted..");
//        }else{
//            System.out.println("Array is not shorted!!");
//        }
        //6. Returning a new array by deleting a specific element from array.
//        int[] num=ArrayUtility.takeUserInput();
//        System.out.print("Enter deleting element:: ");
//        Scanner sc=new Scanner(System.in);
//        int delete=sc.nextInt();
//        int[] newArr=returnArray(num, delete);
//        System.out.println("New array is:: ");
//        ArrayUtility.displayArray(newArr);
        //7. Reverse an Array
//        int[] arr=ArrayUtility.takeUserInput();
//        System.out.println("Odl array is:: ");
//        ArrayUtility.displayArray(arr);
//        System.out.println("New array is:: ");
//        reverseArray(arr);
//        ArrayUtility.displayArray(arr);
        //8. Check given array is palindrome or not
//        int[] num=ArrayUtility.takeUserInput();
//        if (checkPalindrome(num)) {
//            System.out.println("Yes array is palindrome..");
//        }else{
//            System.out.println("No array is not palindrome!!");
//        }
        //9. Short and merge two array
        int[] arr1=ArrayUtility.takeUserInput();
        int[] arr2=ArrayUtility.takeUserInput();
        int[] merge=merge(arr1,arr2);
        System.out.println("After merge:: ");
        ArrayUtility.displayArray(merge);
    }
    public static long sumOfArray(int[] num){
        int sum=0;
        int i=0;
        while(i<num.length){
            sum+=num[i];
            i++;
        }
        return sum;
    }
    public static double averageOfArray(int[] num){
        return (double) (sumOfArray(num)/num.length);
    }
    public static boolean searchingElement(int[] num){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to search:: ");
        int search=sc.nextInt();
        int i=0;
        while(i<num.length){
            if(search==num[i]){
                return true;
            }
            i++;
        }
        return false;
    }
    public static int countOccurrence(int[] nums, int num){
        int occ=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
    public static int minArr(int[] num){
        int min=Integer.MAX_VALUE;
        int i=0;
        while(i<num.length){
            if(min>num[i]){
                min=num[i];
            }
            i++;
        }
        return min;
    }
    public static int maxArr(int[] num){
        if(num.length==0){
            return Integer.MIN_VALUE;
        }
        int max=num[0];
        int i=1;
        while(i<num.length){
            if(max<num[i]){
                max=num[i];
            }
            i++;
        }
        return max;
    }
    public static boolean increasingOrder(int[] num){
        int i=1;
        while(i<num.length){
            if(num[i]>num[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean decreasingOrder(int[] num){
        int i=1;
        while(i<num.length){
            if(num[i]<num[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static int[] returnArray(int[] arr, int deleteElement){
        int occ=countOccurrence(arr, deleteElement);
        if(occ==0){
            return arr;
        }
        int[] newArr=new int[arr.length-occ];
        int i=0;
        int j=0;
        while(i<arr.length){
            if(deleteElement!=arr[i]){
                newArr[j]=arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
    public static void reverseArray(int[] arr){
        int i=0;
        while(i<arr.length/2){
           int swap=arr[i];
           arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
            i++;
        }
    }
    public static boolean checkPalindrome(int[] arr){
        int i=0;
        while(i<arr.length/2){
            if(arr[i]!=arr[arr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int size=arr1.length+arr2.length;
        int[] newArr=new int[size];
        int i=0, j=0, k=0;
        while(i<arr1.length || j<arr2.length){
            if(j==arr2.length ||
                    (i<arr1.length && arr1[i]<arr2[j])){
                newArr[k]=arr1[i];
                i++;
                k++;
            }else{
                newArr[k]=arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
    }
}

class OtherArrayProgram{
    public static void main(String[] args) {
        //1. Bubble Shorting in array
//        System.out.println("Shorting incremental order");
//        int[] num=ArrayUtility.takeUserInput();
//        System.out.println("Array Before Shoring:: ");
//        ArrayUtility.displayArray(num);
//        System.out.println("Array After Shorting:: ");
//        int[] newArr=shortingIncrementalOrder(num);
//        ArrayUtility.displayArray(newArr);
//        System.out.println("Shorting decremental order");
//        int[] num=ArrayUtility.takeUserInput();
//        System.out.println("Array Before Shoring:: ");
//        ArrayUtility.displayArray(num);
//        System.out.println("Array After Shorting:: ");
//        ArrayUtility.displayArray(shortingDecrementalOrder(num));
        //2. Calculate sum of diagonal of a 2-D array.
        int[][] num1=ArrayUtility.takeUserInput2DArray();
        System.out.println("Your Array is:: ");
        ArrayUtility.display2DArray(num1);
        int sum=sumOfDiagonal(num1);
        System.out.println("Sum of Diagonal of Array is:: "+sum);

    }
    public static int[] shortingIncrementalOrder(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=(i+1);j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
            }
        }
        return arr;
    }
    public static int[] shortingDecrementalOrder(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
            }
        }
        return arr;
    }
    public static int sumOfDiagonal(int[][]arr){
        int arr1Sum=sumOfLeftDiagonal(arr);
        int arr2Sum=sumOfLeftDiagonal(arr);
        int sum=arr1Sum+arr2Sum;
        if(arr.length%2!=0){
            int ind=(arr.length/2);
            sum-=arr[ind][ind];
        }
        return sum;
    }
    public static int sumOfLeftDiagonal(int[][] num){
        int cum=0;
        int i=0;
        while(i< num.length){
            cum+=num[i][i];
            i++;
        }
        return cum;
    }

    public static int sumOfRightDiagonal(int[][] num){
        int cum=0;
        int i=0;
        while(i< num.length){
            int col=(num.length-1)-i;
            cum+=num[i][col];
            i++;
        }
        return cum;
    }
}