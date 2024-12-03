package Challenges12;

public class TestAbstraction {
    public static void main(String[] args) {
        Circle c=new Circle(4.5);
        System.out.println("Area of circle is:: "+c.calculateArea());
        Square s=new Square(2.6);
        System.out.println("Area of square is:: "+s.calculateArea());
    }
}
