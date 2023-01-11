package class5;
import java.util.Scanner;
/*
if you put a (!) in front of boolean value it will single out that variable
|| means OR
Specific to boolean conditions
Logical Operators***
1)! NOT
2)|| OR
3)&& AND
THey only work with boolean (true,false) values
Why should we use logical Operators?
1)THey  can greatly simplify the logic
2)It also shortens code
NOT(!):
1)reverses condition (if true it will make it false and vic versa
OR (||):
1) If at lest one condition is true it will be true. Only false if both conditions are false.
2) after you use (||) for the first time you can then use only one (|). true||false|false|
 */
public class LogicalOperators {
    public static void main(String[] args) {

        /*boolean boughtCho=true;
        boolean boughtFlowers=true;
        if(boughtCho||boughtFlowers){
            System.out.println("I am happy");
        }else{
            System.out.println("I am sad");
        }*/

        /*String password="Pass123";
        System.out.println(password.equals("Pass123"));
        if (!password.equals("Pass123")){
            System.out.println("Wrong Password");
        }

        boolean isRaining=true;

        if (!isRaining){
            System.out.println("Let's go for a walk");
        }else{
            System.out.println("Let's take an umbrella");
        }*/

// From here we are using (||) method.*********************************************************
        /*
        equals ignore case IGNORES case sensitivity
         */
        System.out.println("Please Enter the day");
        Scanner user=new Scanner(System.in);
        String day=user.next();

        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("No class today");
        } else if (day.equalsIgnoreCase("saturday")||day.equalsIgnoreCase("sunday")) {
            System.out.println("java class");
        }else if (day.equalsIgnoreCase("tuesday")||day.equalsIgnoreCase("wednesday")){
            System.out.println("manual testing class");
        }else if(day.equalsIgnoreCase("thursday")){
            System.out.println("review class");
        }else{
            System.out.println("wrong day entered");
        }


    }
}
