package example.java.advance.Wrapper;

public class AutoBoxing {
    public static void main(String[] args) {
        int x=10;
        System.out.println(x);
        Integer num=x;//AutoBoxing
        System.out.println(num);
        int y=num;//Auto In boxing..
        System.out.println(y);
        Integer number=Integer.valueOf("12");// Always convert to Integer.
        System.out.println(number+23);
    }
}
