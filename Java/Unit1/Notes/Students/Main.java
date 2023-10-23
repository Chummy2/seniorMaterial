import java.util.ArrayList;
public class Main{

    public static void main(String[] args){

        ArrayList<Student> classroom = new ArrayList<Student>();

        classroom.add(new Student("ty", 9));
        classroom.add(new Student("zander", 0));
        classroom.add(new Student("brucken", 10));
        classroom.add(new Student("ben", 7));
        classroom.add(new Student("Pohl", 5));
        classroom.add(new Student("steckler", 107));
        classroom.add(new Student("owen", 50));
        classroom.add(new Student("sam", 1));
        classroom.add(new Student("landon", 82));

        System.out.println(classroom);


    }
}