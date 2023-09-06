import java.util.Scanner;

public class costofdrive {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("enter the driving distance: ");
        double distance = ui.nextDouble();
        System.out.println("Enter miles per gallon: ");
        double miles= ui.nextDouble();
        System.out.println("Enter price per gallon: ");
        double price= ui.nextDouble();
        double cost =  (double)(distance/miles)*price;
        System.out.printf("Cost: %.2f%n", cost);
    }
}
