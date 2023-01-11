package class5;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

    /*
    Scanner => Name of the class
     */
        System.out.println("Please Enter your age");
        int age=scan.nextInt();
        System.out.println("You are "+age+" Years old");


        System.out.println("Enter your first name");
        String name=scan.next();// only use next when there is only one word
        System.out.println("Your name is"+name);

        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is"+fullName);
    }
}
