package Module_1;

public class Loops_Statements {
    public static void main(String[] args) {
        /**
         * In java there are total 4 loops present.
         * 1. While Loop
         * 2. Do-wile loop
         * 3. For loop
         * 4. For-each loop
         */
        whileLoop_RightAngleTriangle(5);
        System.out.println("===========================");
        do_WhileLoop_RightAngleTriangle(10);
        System.out.println("===========================");
        for_Loop_RightAngleTriangle(15);
    }
    //1. While loop:
    public static void whileLoop_RightAngleTriangle(int row){
        int i=0;
        while(i<row){
            int j=0;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    //2. do-while loop:
    public static void  do_WhileLoop_RightAngleTriangle(int row){
        int i=0;
        do{
            i++;
            int j=0;
            do{
                System.out.print("* ");
                j++;
            }while(j<i);
            System.out.println();
        }while(i<=row);
    }
    //3. for loop:
    public static void for_Loop_RightAngleTriangle(int row){
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



