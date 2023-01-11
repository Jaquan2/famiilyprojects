package Review2;

import java.sql.SQLOutput;

public class IfStatement2 {
    public static void main(String[] args) {

        int day=2;

        if (day==1){
            System.out.println("It is the first of the month");
        }

        String month="December";

        if (month.equals("December")){
            System.out.println(" It is Christmas Time");
        }

        boolean night=true;

        if (night){
            System.out.println("Then we are half way through class");
        }

        String holiday="Christmas2";

        if (holiday.equals("Christmas")){
            System.out.println("Then we do not have weekend java classes");
        }else if (holiday=="New Years"){
            System.out.println("Then we still do not have java weekend class");
        }else if (holiday=="Halloween"){
            System.out.println("We still have java weekend classes");
        } else if (holiday=="Christmas2"){
            System.out.println("we should study");
        }


    }
}
