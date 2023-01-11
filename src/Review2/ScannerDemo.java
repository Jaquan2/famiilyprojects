package Review2;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        int D=10;

        // non primitive variable = scanner
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();// to capture int values
        boolean tired=input.nextBoolean(); // to capture boolean values
        String name=input.next(); // to capture String until space

        System.out.println(age);
        System.out.println(tired);
        System.out.println(name);






    }
}
