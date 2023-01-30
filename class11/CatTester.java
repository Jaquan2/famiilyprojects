package class11;
// remember to use main methods to execute
public class CatTester {
    public static void main(String[] args) {

        //creating an object/member from another class
        Cat cat1=new Cat();

        cat1.name="Rocket";
        cat1.attitude=true;
        cat1.age= 2;
        cat1.furColor="white";







       Cat cat2=new Cat();
       cat2.name="Loki";
       cat2.age=3;
       cat2.breeds="Domestic";
       cat2.furColor="orange";

       cat1.speak();
       cat2.hunter();
       


    }
}
