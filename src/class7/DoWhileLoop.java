package class7;
import java.util.Scanner;
/*
variable++; increase number by 1
Always remember to declare variable outside of {}
DOWHILELOOP will always work
While loop is used more heavily than dowhileloop

 */
public class DoWhileLoop {
    public static void main(String[] args) {
    Scanner user=new Scanner(System.in);

    int number=0;
    do {
        System.out.println("Please enter a number");
        number=user.nextInt();
    } while (number!=5);

    int number1=0;

    while(number!=0){
        System.out.println("Please enter a number: ");
        number1=user.nextInt();
    }




    }
}
