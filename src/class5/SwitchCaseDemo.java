package class5;
/*
Switch case statements will jump to the direct value that you are looking for
Switch case has limitations
Its another way to achieve if-else-if conditions

Why do we learn about Switch?

~Simple they are FAST
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {

       int day=7;
       switch(day){

           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
           default:
               System.out.println("wrong day");


       }





    }
}
