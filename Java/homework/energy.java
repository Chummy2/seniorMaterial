import java.util.Scanner;
public class energy {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("enter the amount of water in kilograms: ");
        double m= ui.nextDouble();
        System.out.println("Enter the inital temperature: ");
        double inital= ui.nextDouble();
        System.out.println("Enter the inital temperature: ");
        double last= ui.nextDouble();
        double q =  (double)m*(last-inital)*4184;
        System.out.printf("energy needed: %.2f%n",q);
        //System.out.format(miles+" miles is "+km+" kilometers", "%.2f", km);
        ui.close();
    }
}
