package example.java.advance.Enum;

public enum DemoTrafficLight{
    RED("Stop"), GREEN("Run"), YELLOW("Start");
    private final String action;
    DemoTrafficLight(String action){
        this.action=action;
    }
    public String getAction(){
        return action;
    }

}
