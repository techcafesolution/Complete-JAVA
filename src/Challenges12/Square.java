package Challenges12;

public class Square extends Shapes{
    private double sides;

    public Square(double sides) {
        this.sides = sides;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    @Override
    public double calculateArea() {
        return sides*sides;
    }
}
