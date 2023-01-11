package Review2;

public class NestedIf {
    public static void main(String[] args) {
        /*
        nested if is 1 condition that depends on another.
         */
        boolean vaccine=true;
        int dose=2;

        if (vaccine){ // outer if vaccine: false
            System.out.println("Haw many doses do you have?");
            //inner if is always depended upon outer if

            if (dose==1){
                System.out.println("You need a second shot");
            }else{
                System.out.println("You are full vacinated");
            }


        }else{
            System.out.println("I do not have a vaccine");
        }
    }
}
