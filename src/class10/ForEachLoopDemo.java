package class10;

public class ForEachLoopDemo {
    public static void main(String[] args) {

        int[] numbers={10,13,20,25,45,50};

        for (int i=0; i <numbers.length;i++){
            if (numbers[i]%2!=0){
                System.out.println(numbers[i]);
            }


        }
        System.out.println("******************");

        for (int i=0; i <numbers.length;i++){
            if (numbers[i]%2!=0) {
              numbers[i]=0;
            }
        }

        for (int i=0; i < numbers.length;i++) {
            System.out.println(numbers[i]);
        }

    }
}
