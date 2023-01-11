package class5;
/*
char gender=scanner.next().charAt(0);
use this with scanner and char
 */
public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        char gender='M';

        switch (gender){

            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
        }
    }
}
