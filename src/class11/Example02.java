package class11;

public class Example02 {
    public static void main(String[] args) {

        int [][] matrix= {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };

        for (int[] bus:matrix){
            for (int kids:bus){
                System.out.print(kids+" ");
            }
            System.out.println();
        }






    }
}
