import java.util.Scanner;

 class UserInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Name:: ");
        String name=input.nextLine();
        System.out.println("Welcome "+name+" To My Home");
    }
}
