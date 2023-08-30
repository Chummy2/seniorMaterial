import java.util.Scanner;
public class milestokm {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("enter miles: ");
        double miles = ui.nextDouble();
        double km =  (double)miles*1.6;
        System.out.println(miles+" miles is "+km+" kilometers");
        System.out.format(miles+" miles is "+km+" kilometers", "%.2f", km);
        ui.close();
    }
}