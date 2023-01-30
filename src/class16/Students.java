package class16;

public class Students {

    String name;

    String ID;

    static int numberOfStudents;


    public static void main(String[] args) {

        Students student= new Students();

        student.name="Jaquan";
        student.ID="Jay123";
        student.numberOfStudents++;


        Students student1= new Students();

        student1.name="Gladys";
        student1.ID="GlDY23";
        student1.numberOfStudents++;

        System.out.println(student.numberOfStudents);

    }
}
