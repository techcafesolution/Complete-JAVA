package Challenges11;

public class TestEmployees {
    public static void main(String[] args) {
        SampleEmployee se=new SampleEmployee("Sanjeeb","DFY6001",56000);
        System.out.println(se.displayAccountDetails());
        se.setEmployeeName("Rajib");
        System.out.println(se.displayAccountDetails());
    }
}
