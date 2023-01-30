package class10;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int [] values= {10,20,30,40,50};
        System.out.println(values[4]);
        System.out.println(values[1]+" "+values [4]);

        for (int i=0; i < values.length;i++) {
            System.out.println(values [i]);

        }
        System.out.println("*****************");

        //Enhanced/foreach for loop
        //whenever possible used enhanced formula

        for (int user:values) {
            System.out.println(user);
        }
    }
}
