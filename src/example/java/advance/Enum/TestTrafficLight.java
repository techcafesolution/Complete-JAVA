package example.java.advance.Enum;

public class TestTrafficLight {

    public static void main(String[] args) {
    DemoTrafficLight signal=DemoTrafficLight.valueOf("RED");
        System.out.println(signal.getAction());
        signal=DemoTrafficLight.valueOf("GREEN");
        System.out.println(signal.getAction());
        signal=DemoTrafficLight.valueOf("YELLOW");
        System.out.println(signal.getAction());

    }
}
