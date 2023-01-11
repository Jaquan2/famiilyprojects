package Review2;

public class IfElseIf {
    public static void main(String[] args) {
        int homework=35;

        if (homework>25){
            System.out.println("Great job");
        }else if (homework>20){
            System.out.println("good job");
        }else if (homework>15){
            System.out.println("okay job");
        }else if (homework>10){
            System.out.println("pushing it");
        }else if (homework>5){
            System.out.println("not good job");
        }


        System.out.println("------------------------------------------");

        String browser= "Chrome";

        if (browser.equals("Chrome")){
            System.out.println("test cases are executed on Chrome browser");
        }else if (browser.equals("safari")){
            System.out.println("Executed on safari");
        }else if (browser.equals("firefox")){
            System.out.println("Execute on firefox");
        }else{
            System.out.println("Browser is not supported");
        }
    }
}
