package Challenge09.geometry.utils;

public class Circle {
    private double radius;
    private final double PI=Math.PI;

    Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getPI(){
        return PI;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
}
