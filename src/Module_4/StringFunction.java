package Module_4;

public class StringFunction {
    public static void main(String[] args) {
        /*
        Property of String..
        1. String is always immutable( that means you can't change String name)
        2. String which is used inside "literal" is always doing address level comparison.
        3. To perform content level comparison we have to use .equals() method.
         */
        String str1="abc";
        System.out.println(str1);
        String str2="abc";
        System.out.println(str1==str2);
        str1+="hi";
        System.out.println(str1==str2);
        System.out.println(str1);
        str2=str1;
        System.out.println(str1==str2);
        System.out.println(str2);
        String name="Sanjeeb";
        String name2=name+" dash";
        System.out.println(name2);
        System.out.println(name);
        System.out.println(name.equals(name2));
        name=name2;
        System.out.println(name.equals(name2));
        System.out.println(name==name2);
        System.out.println("==============");
        String s1="abc";
        String s2=new String("abc");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
