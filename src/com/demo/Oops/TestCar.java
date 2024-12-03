package com.demo.Oops;

 class TestCar {
    public String name;
    public String color;
    int noOfWheel;
    protected double fuel;
    private final long millage;

    TestCar(String name, String color, int noOfWheel, double fuel){
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
        TestCar tc=new TestCar("TATA", "Green",5,45.87);
        System.out.println(tc.toString());
    }
}
