package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {

        int sum=0;
        int totalEven=0;

       int [] values= {10,20,30,4,5,6,7,80};
      for (int i=0;i < values.length;i++) {
          if (values[i] % 2 == 0){
              totalEven+=i;
          }
          System.out.println(i);
      }
        System.out.print(sum);

    }
}
