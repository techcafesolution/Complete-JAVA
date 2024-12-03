package com.demo.Oops;

public class DemoCar {
    public String name;
    public String color;
    int noOfWheel;
    protected double fuel;
    private final long millage;

    public DemoCar(String name, String color, int noOfWheel, double fuel) {
        this.name = name;
        this.color = color;
        this.noOfWheel = noOfWheel;
        this.fuel = fuel;
        this.millage = 654875L;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DemoCar{");
        sb.append("name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", noOfWheel=").append(noOfWheel);
        sb.append(", fuel=").append(fuel);
        sb.append(", millage='").append(millage).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        DemoCar dc=new DemoCar("Safari", "Black", 4, 50.54);
        System.out.println(dc.toString());
    }
}
