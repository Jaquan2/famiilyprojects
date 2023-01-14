package class8;
import java.util.Scanner;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {
        Scanner temp1= new Scanner (System.in);

    /*boolean summer=true;
    int temp=75;

    while(summer){

        if (temp<=90){
            System.out.println("I love summer becasue temp is"+temp);
        } else{
            System.out.println("I am hot "+temp);
            break;
        }
    temp+=5;

    }*/

    int hot= 75;
    boolean summer2=true;

    do {
        System.out.println("I love summer because temp is "+hot);
        hot= temp1.nextInt();
    }while (hot<=90);

    if(hot>=90){
        System.out.println("Its to hot "+hot);
    }





  }
}
