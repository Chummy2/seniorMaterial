import java.util.Scanner;

public class BabyAge {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("what age are you in years? (number please)");
        Integer years = ui.nextInt();
        System.out.println("Your age in months: "+years*12);
        ui.close();
    }
}
