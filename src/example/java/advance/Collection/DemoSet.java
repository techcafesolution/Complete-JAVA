package example.java.advance.Collection;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        /**
         * Doesn't allow duplicate
         * Does allow null value
         */
        Set<Object> set=new HashSet<>();
        System.out.println(set.add("Sanjeeb"));
        System.out.println(set.add(234));
        System.out.println(set.add('c'));
        System.out.println(set.add(45.69));
        Utility.print(set);
        System.out.println(set.size());
        System.out.println(set.add('c'));
        System.out.println(set.size());
        Utility.print(set);
        System.out.println(set.add(null));
        System.out.println(set.contains(45.69));
        System.out.println(set.remove(45.69));
        System.out.println(set.remove(45.68));
        System.out.println(set.isEmpty());
        Utility.print(set);

    }
}
