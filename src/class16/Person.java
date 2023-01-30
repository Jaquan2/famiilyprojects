package class16;

public class Person {

    private void printPhonePassword(){
        System.out.println("password");
    }

    void printSSN(){
        System.out.println("1234567");
    }

    public void printTikTokAccount(){
        System.out.println("user1234");
    }

    public static void main(String[] args) {
        Person person=new Person();
        person.printSSN();

    }
}
