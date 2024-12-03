 class Swap_Number {
    public static void main(String [] args){
        int myNum=4;
        int yourNum=8;
        System.out.println("Before Swaping: ");
        System.out.println("My Num is:: "+myNum);
        System.out.println("Your Num is:: "+yourNum);
        //myNum=(myNum+yourNum)-myNum;
        yourNum=(myNum+yourNum)-yourNum;
        myNum=myNum+yourNum;
        System.out.println("After Swaping: ");
        System.out.println("My Num is:: "+myNum);
        System.out.println("Your Num is:: "+yourNum);
    }
}
