import java.util.Scanner;
public class gpacalc {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter a grade ");
        int grade = ui.nextInt();
        System.out.println("Enter a grade ");
        int grade2 = ui.nextInt();
        System.out.println("Enter a grade ");
        int grade3 = ui.nextInt();
        System.out.println("Enter a grade ");
        int grade4 = ui.nextInt();
        int finalgrade = grade+grade2+grade3+grade4;
        double realgrade = (double) finalgrade/4;
        System.out.println("Your gpa is: "+realgrade);
        ui.close();
    }
}
// total/=4   //reassigns total to be total/4