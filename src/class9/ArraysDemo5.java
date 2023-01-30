package class9;

import java.util.List;

public class ArraysDemo5 {
    public static void main(String[] args) {

        int sum=0;

       int [] values= new int[5];

       values[0]=45;
       values[1]=44;
       values[2]=33;
       values[3]=20;
       values[4]=10;

       for (int i=0;i < values.length;i++) {
           if (i % 2 == 0) {//if we are focusing on index "i"
               sum += values[i];
           }
           System.out.println(sum);

       }

    }
}
