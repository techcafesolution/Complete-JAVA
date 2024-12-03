package Module_4;

public class MathFunctions {
    public static void main(String[] args) {
        //abs()--> Generate absolute value convert - to +;
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(10));
        //ceil()-->
        System.out.println(Math.ceil(4.58));
        //floor()-->It remove decimal digit.
        System.out.println(Math.floor(4.58));
        //round()-->It generate round number.
        System.out.println(Math.round(4.58));
        System.out.println("==================");
        //random
        for(int i=0;i<10;i++){
            int random=(int)Math.round(Math.random()*100);
            System.out.println(random);
        }
        System.out.println("==================");
        //max()
        System.out.println(Math.max(12,76));
        //min()
        System.out.println(Math.min(12,76));
        //pow()
        System.out.println(Math.round(Math.pow(5,3)));
        //sqrt()
        System.out.println(Math.ceil(Math.sqrt(144)));
        //pie()
        System.out.println(Math.PI);
    }
}
