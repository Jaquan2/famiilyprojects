package class12;

public class StringDemo9 {
    public static void main(String[] args) {

        String str="lksjsdfljs13413451 **&&^%%";

        int counter=0;
        for (int i=0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
    }
}
