package class12;

public class StringDemo3 {
    public static void main(String[] args) {

        String firstName="jaquan";
        String lastName="Perkins";
        //Most commonly used in the industry
        String fullName= firstName+ " "+lastName;
        System.out.println(fullName);

        //This method is rarely used
        System.out.println(firstName.concat(" "+lastName));
    }
}
