package class8;

public class NestedLoops4 {
    public static void main(String[] args) {
        for (int a = 0; a < 3; a++) {



           if (a==1){
               System.out.println();
               continue;
           }


            for (int j = 0; j < 5; j++) {
                System.out.print("*");


            }
            System.out.println();
        }
    }
}