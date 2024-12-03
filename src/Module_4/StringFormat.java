package Module_4;

public class StringFormat {
    public static void main(String[] args) {
        String name="Sanjeeb";
        int num=4567;
        System.out.println("Your Name is "+name+" and Number is:: "+num);
        System.out.printf("Your Name is %-15S and Number is:: %,+d",name,num);
    }
}
