package in.test.Oops;

import com.demo.Oops.DemoCar;
//import com.demo.Oops.TestCar;

public class TestAccessModifiers {
    public static void main(String[] args) {
        DemoCar dc=new DemoCar("Farrari", "Pink",5,54.21);
        System.out.println(dc.toString());

    }
}
