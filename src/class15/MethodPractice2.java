package class15;

public class MethodPractice2 {

     String reverseStr(String word) {

        String str = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            str+=word.charAt(i);
        }
        return str;
    }

}
