package class8;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {
    Scanner user= new Scanner (System.in);

        System.out.println("Please enter your name");
    while(user.next().equalsIgnoreCase("Sha")){
        System.out.println("Great student who always wanted an example with String in loop");
    }




  }
}
