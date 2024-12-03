package Module_4;

public class StringTest {
    /**
     * String Buffer: It is thread safe in nature but slowest operation
     * String Builder: It is thread unsafe in nature but firstest in operation.
     */
    public static void main(String[] args) {
        String name=new String("Sanjeeb");
        name.concat(" Lochan ");
        name.concat("Dash");
        System.out.println(name.toString());
        StringBuilder str=new StringBuilder("Sanjeeb");
        str.append(" Locahan ");
        str.append(34);
        str.append("Dash");
        System.out.println(str.toString());
    }
}
class CAR{
    String name;
    int noOfWheel;
    String color;
    int maxSpeed;

    public CAR(String name, int noOfWheel, String color, int maxSpeed, double fuel) {
        this.name = name;
        this.noOfWheel = noOfWheel;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
    }

//    @Override
//    public String toString() {
//        return "CAR{" +
//                "name='" + name + '\'' +
//                ", noOfWheel=" + noOfWheel +
//                ", color='" + color + '\'' +
//                ", maxSpeed=" + maxSpeed +
//                ", fuel=" + fuel +
//                '}';
//}
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CAR{");
        sb.append("name='").append(name).append('\'');
        sb.append(", noOfWheel=").append(noOfWheel);
        sb.append(", color='").append(color).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", fuel=").append(fuel);
        sb.append('}');
        return sb.toString();
    }


    public static void main(String[] args) {
        CAR car=new CAR("Innova",4,"Black", 280, 250.783d);
        System.out.println(car.toString());
    }

    double fuel;

}