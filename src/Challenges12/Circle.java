package Challenges12;

public class Circle extends Shapes{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea(){
        return PI*Math.pow(radius,2);
    }

}
