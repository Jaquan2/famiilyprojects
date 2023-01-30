package class9;

public class ArraysDemo1 {
    public static void main(String[] args) {

        int [] values= {10,20,30,40,50,60,70,80,90,100};

        int sum=0;

        for (int i=0; i< values.length; i++) {
            sum+=values[i];
        }
        System.out.println(sum);

    }
}
