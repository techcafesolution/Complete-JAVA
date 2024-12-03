package example.java.advance.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Challenges {
    public static void main(String[] args) {
        System.out.println(concate("hi","bye","good"));
        List<String> stringList= Arrays.asList("Tiger","Bear","Ant","Zebra","Monkey");
        System.out.println(stringList);
        shortArrayList(stringList);
        System.out.println(stringList);
        reverseArrayList(stringList);
        System.out.println(stringList);
        descendingArrayList(stringList);
        System.out.println(stringList);
        List<Integer> integerList=Arrays.asList(1,5,1,7,5,1,8,9,8,4);
        System.out.println(Collections.frequency(integerList,5));
        List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(num);
        swapNumber(num,3,5);
        System.out.println(num);

    }
    public static String concate(String... arguments){
        StringBuilder con= new StringBuilder();
        for (String argument : arguments) {
            con.append(argument);
        }
        return con.toString();
    }
    public static void shortArrayList(List<String> stringList){
        Collections.sort(stringList);
    }

    public static void reverseArrayList(List<String> stringList){
        Collections.reverse(stringList);
    }
    public static void descendingArrayList(List<String> stringList){
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) {
                    return 0;
                }else if(o1.charAt(0)<o2.charAt(0)){
                    return -1;
                }else{
                    return 1;
                }
            }
        });

    }

    public static void swapNumber(List<Integer> list, int x, int y){
        int swap=list.get(x);
        list.set(x,list.get(y));
        list.set(y, swap);
    }
}
