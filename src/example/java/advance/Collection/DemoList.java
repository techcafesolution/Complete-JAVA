package example.java.advance.Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        /**
         * ArrayList is class of List interface.
         * It is auto increment in nature.
         * Duplicates are allowed
         * Null values are allowed.
         */
        ArrayList<String> al=new ArrayList<>();
        //Add data
        al.add("Sanjeeb");
        al.add(1, "Lochan");
        al.add(2, "Dash.");
        //Null values are allowed
        al.add(null);
        al.add(null);
        //Duplicates are allowed.
        al.add("Sanjeeb");
        //Fetch data
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));
        //Update Data
        al.set(0, "Rajib");
        //Check the size
        System.out.println(al.size());
        //Check Object
        if(al.contains("Rajib")){
            System.out.println(al.indexOf("Rajib"));
        }
        //Remove Data
        al.remove(1);
        al.remove("Dash.");
        al.removeAll(al);
        //Clear Data
        al.clear();
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        List<Integer> al2=new ArrayList<>();
        for(int i=0;i<=10;i++){
            al2.add(i);
        }
        Iterator<Integer> it=al2.iterator();
        while(it.hasNext()){
            Integer i=it.next();
            if(i%2==0){
                it.remove();
            }
        }
        for(Integer i:al2){
            System.out.println(i);
        }

    }
}
