package Module_1;

public class Functions_InJava {
    public static void main(String[] args) {
        /**
         * In java generally 4 types of functions are available.
         * 1. Function without return type without argument.
         * 2. Function without return type with argument.
         * 3. Function with return type without argument.
         * 4. Function with return type with argument.
         */
        printName();
        printName("Rajib");
        String name=printAndReturnName();
        System.out.println(name);
        System.out.println("My Name is:: "+printAndReturnName("Rajib"));
    }
    //1. Function without return type without argument.
    public static void printName(){
        System.out.println("My Name is:: Sanjeeb");
    }
    //2. Function without return type with argument.
    public static void printName(String name){
        System.out.println("My Name is:: "+name);
    }
    //3. Function with return type without argument.
    public static String printAndReturnName(){
        System.out.println("My Name is:: Sanjeeb");
        return "Rajib";
    }
    //4. Function with return type with argument.
    public static String printAndReturnName(String name){
        System.out.println("My Name is:: Sanjeeb");
        return name;
    }
}
