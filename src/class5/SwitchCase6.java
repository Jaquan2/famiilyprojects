package class5;
/*
(country.toLowerCase()) coverts text to lower case

 */
public class SwitchCase6 {
    public static void main(String[] args) {

        String country="Greece";

        System.out.println(country.toLowerCase());

        switch(country.toLowerCase()){

            case"usa":
                System.out.println("Steak");
                break;

            case "italy":
                System.out.println("pasta");
                break;

            case "greece":
                System.out.println("Lamb");
                break;

            default:
                System.out.println("Wrong country");

        }
    }
}
