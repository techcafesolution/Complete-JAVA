package Challenge09.geometry.utils;

public class Rectangle {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    public void setLength(double length){
        this.length=length;
    }
    public void setBreadth(double breadth){
        this.breadth=breadth;
    }
}
