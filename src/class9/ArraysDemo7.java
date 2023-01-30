package class9;

public class ArraysDemo7 {
    public static void main(String[] args) {

        double [] values= {10.5,12.0,45,10.5,23,10.5};

        int count=0;
        for (int i=0;i <values.length;i++) {
            if (values[i] == 10.5){
            count++;
            }
        }
        System.out.println(count);

        }
}
