package homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {

        Scanner user=new Scanner(System.in);
        int num1,num2,num3;

        System.out.println("Please enter three numbers");
        num1=user.nextInt();
        num2=user.nextInt();
        num3=user.nextInt();

        if (num1>num2&&num1>num3){
            System.out.println("the largest number is "+num1);
        }else if (num2>num1&&num2>num3){
            System.out.println("The largest number is "+num2);
        }else if (num3>num1&&num3>num2){
            System.out.println("The largest number is "+ num3);
        }



    }
}
