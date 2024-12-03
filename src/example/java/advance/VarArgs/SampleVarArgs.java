package example.java.advance.VarArgs;

public class SampleVarArgs {
    public static void main(String... args){
        System.out.println(add(4,6));
        //System.out.println(sum(new int[] {2,3,6}));
        //System.out.println(sum(4,5,8,6));
        System.out.println(sum(2,5,8,4));
    }
    public static int add(int a, int b){
        return a + b;
    }

//    public static int sum(int[] a){
//        int sum=0;
//        for (int i : a) {
//            sum+=i;
//        }
//        return sum;
//    }

//    public static int sum(int... args){
//        int sum=0;
//        for (int arg : args) {
//           sum+=arg;
//        }
//        return sum;
//    }

    public static int sum(int a, int b, int... args){
        int sum=a+b;
        for (int arg : args) {
            sum+=arg;

        }
        return sum;
    }
}
