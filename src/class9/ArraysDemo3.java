package class9;

public class ArraysDemo3 {
    public static void main(String[] args) {

        char [] letters={'A','B','C','D'};
        letters[1]='b';// updating the element at index 1
        for (int i=0; i<letters.length;i++){
            System.out.print(letters[i]+" ");
        }
        System.out.println();

    }
}
