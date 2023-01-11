package class5;
/*
&& used to combine if statements
in statement with && If both true it is true if one or more false it will print false
(!) will make a boolean ugly=!true; (!) makes it oposite of the statement
 */
public class LogicalOperators1 {
    public static void main(String[] args) {


    double mathScore=92.5;
    double historyScore=91.5;
    double scienceScore=93.5;

    if (mathScore>90&&historyScore>90&&scienceScore>90){
        System.out.println("You are a great student");
    }else{
        System.out.println("Work harder");
    }

    boolean cond=false;
    boolean condition=!cond;
        System.out.println(condition);
    if(condition){
        System.out.println("You got this");
    }else{
        System.out.println("Need more practice");
    }



    }
}
