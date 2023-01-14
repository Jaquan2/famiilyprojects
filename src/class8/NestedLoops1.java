package class8;

public class NestedLoops1 {
    public static void main(String[] args) {
        for(int a= 0; a < 5; a++) {

            for(int j = 0; j < 5; j++) {
                System.out.println("a= "+a+" j = "+j);
            }
            System.out.println("******************");
        }
    }
}
