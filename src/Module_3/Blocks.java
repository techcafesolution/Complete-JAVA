package Module_3;

public class Blocks {
    /**
     * Block is one of the member in Java class
     * Block is used to initialize and re-initialize the property/variables.
     * Blocks are two types: 1. Static Block 2. Non-static Block
     * By using static block we can only initialize and re-initialize the static variable.
     * Similarly, by using non-static block we can initialize or re-initialize non-static variable.
     * JVM first invoke block before invoke constructor.
     * static block call only once at time of compilation.
     * Non-static method invoke again and again at time of object creation.
     * Without creating an object we can't access non-static block.
     */
    static String message;
    static int count;
    static{
        message="Static Block is Running...";
    }
    {
        count++;
        System.out.println("Non-static block is running...");
    }

    public static void main(String[] args) {
        System.out.println(message);
        System.out.println("Main method is running..");
        Blocks block=new Blocks();
        Blocks block2=new Blocks();
        Blocks block3=new Blocks();
        System.out.println("Total number of Object creation is:: "+count);

    }
}
