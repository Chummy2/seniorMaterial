import java.util.Scanner;
public class milestokm {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("enter miles: ");
        double miles = ui.nextDouble();
        double km =  (double)miles*1.6;
        System.out.printf(" Km : %.2f%n",km);
        ui.close();
    }
}