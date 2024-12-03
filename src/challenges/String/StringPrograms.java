package challenges.String;

import java.util.Locale;

public class StringPrograms {
    public static void main(String[] args) {
        //1. Reverse a String.
        reverseString("Sanjeeb");
        //2. Remove space from a String.
        removeSpace("Sanjeeb Lochan Dash");
        //3. Count occurrence of character of String.
        countOccurrence("Mahabharat");
        //4. Count no of vowel present in the String.
        countVowel("Occurrence");
        //i/p = "Sanjeeb123Sanjeeb; o/p="beejnaS123beejnaS;
    }
    public static void reverseString(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println("Original String-->"+str);
        System.out.println("Reverse String-->"+rev);
    }
    public static void removeSpace(String str){
        System.out.println("Original String:: "+str);
        str=str.replace(" ","");
        System.out.println("After remove space String:: "+str);
    }
    public static void countOccurrence(String str){
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)&&i>j){
                    break;
                }
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count>0){
                System.out.println(str.charAt(i)+"==>"+count);
            }
        }
    }
    public static void countVowel(String str){
        str=str.toLowerCase();
        String vowel="aeiou";
            int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<vowel.length();j++){
                if (str.charAt(i) == vowel.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.printf("Total no of vowel present in the %s is:: %d",str,count);
    }
}
