package Challenge09.geometry.utils;

public class Calculator {
    public static void main(String[] args) {
        Circle c=new Circle(54.65);
        Rectangle r=new Rectangle(5.24,6.87);

        double areOfCircle=c.getPI()*Math.pow(c.getRadius(), 2);
        double areaOfRectangle=r.getBreadth()*r.getLength();
        System.out.println("Area of rectangle is:: "+areaOfRectangle);
        System.out.println("Area of circle is:: "+areOfCircle);
    }
}
