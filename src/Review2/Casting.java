package Review2;

public class Casting {
    public static void main(String[] args) {
        /*
        Casting-convert 1 datatype into another
        1. widening/implicit/automatic
        2. narrowing/explicit/manual
         */
        double d=5;
        System.out.println(d); //5.0

        double c=10;
        System.out.println(c);

        //narrowing
        int i=(int)5.0;
        System.out.println(i);

        byte b=(byte)128;
        System.out.println(b);
    }
}
