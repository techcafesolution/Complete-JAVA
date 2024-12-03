package Module_1;

public class IF_Else_Statements {
    public static void singleIF(){
        boolean isMale=true;
        String name="Bob";
        if(isMale) System.out.println("Mr. "+name); // If there is a single line statement then we can ignore curly bras.
    }
    public static void if_Else(){
        boolean isMale=false;
        String name="Bob";
        if(isMale)
            System.out.println("Mr. "+name);
        else
            System.out.println("Ms. "+name);
    }
    public static void nestedIF_Else(){
        String name="Sanjeeb";
        boolean isSeniorCitizen=false;
        boolean isAdult=false;
        if(isSeniorCitizen){
            System.out.println(name+" is a SeniorCitizen.");
        }else{
            if(isAdult){
                System.out.println(name+" is an Adult.");
            }else{
                System.out.println(name+" is a Child.");
            }
        }
    }
    public static void ladderIF_Else(){
        String name="Sanjeeb";
        boolean isSeniorCitizen=false;
        boolean isAdult=true;
        if(isSeniorCitizen){
            System.out.println(name+" is a Senior Citizen.");
        }else if(isAdult){
            System.out.println(name+" is an Adult.");
        }else{
            System.out.println(name+" is a Child.");
        }
    }
    public static void main(String[] args) {
        //singleIF();
        //if_Else();
        //nestedIF_Else();
        ladderIF_Else();
    }
}
