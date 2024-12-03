package example.java.advance.Collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {
        //Insertion order not preserved.
        Map<String, Integer> name=new HashMap<>();
        name.put("Sanjeeb",31);
        name.put("Sanjeeb",31);//Duplicates key are not allowed but value allowed.
        name.put("Sanjeeb1",31);//Duplicates key are not allowed but value allowed.
        name.put("Rajib",22);
        name.put("Ankita",26);
        name.put("Ranjita",27);
        name.put("Puspa",0);
        name.put(null,45);//Null value are allowed
        System.out.println(name.size());
        System.out.println(name.remove("Puspa"));
        System.out.println(name.containsKey("Sanjeeb1"));
        System.out.println(name.containsKey("Sanjeeb2"));
        System.out.println(name.keySet());
        System.out.println(name.values());
        for (String key : name.keySet()) {
            System.out.printf("Key:: %s and Value:: %s\n",key,name.get(key));
        }

    }
}
