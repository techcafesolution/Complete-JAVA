 class TypeCasting {
    /**
     * There is two types of type casting possible in Java.
     * 1. Implicit Type Casting:
     * Converting lower data types into upper data types is called implicit type casting.
     * This is auto type casting.
     * Lower--->Upper
     * byte-->short-->int-->long-->float-->double
     * Here no possible of data loss
     * 2. Explicit Type Casting
     * Converting upper data types into lower data types is called explicit type casting.
     * This is force type casting.
     * Upper-->Lower
     * double-->float-->long-->int-->short-->byte
     * Here possiblity of data losses.
     */
    public static void main(String[] args) {
        //Normal case:
        byte myByte = 8;
        short myShort= 10;
        int myInt= 127;
        long myLong=85459756L;
        float myFloat=8.15f;
        double myDouble=8.115566D;
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        //Implicit type casting
        System.out.println("==============");
        float f=45876l;
        long l=48;
        System.out.println(f);
        System.out.println(l);
        System.out.println("===========");
        //Explicit Type Casting
        long l1=4587884554L;
        int i=(int) l1;
        float f1=45.09f;
        long l3=(long) f1;
        double d1=5736.0055487d;
        float f3=(float) d1;
        System.out.println(i);
        System.out.println(l3);
        System.out.println(f3);
    }
}
