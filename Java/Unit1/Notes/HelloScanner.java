import java.util.Scanner;
public class HelloScanner {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("the question, as in what is your name");
        String name = ui.next();
        System.out.println("Hello "+name);

        System.out.println("what grade are you in? (number please)");
        String grade = ui.next();
        System.out.println("Your Grade: "+grade);
        ui.close();
    }
}
