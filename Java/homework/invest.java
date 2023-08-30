import java.util.Scanner;

public class invest {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("enter investment amount: ");
        double investment= ui.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double annual= ui.nextDouble();
        System.out.println("Enter numbers of years: ");
        double years= ui.nextDouble();
        double newyears=Math.pow(years,12);
        System.out.println(newyears);
        double future = investment*(1+annual)*newyears;
        System.out.println("Future Value: $" + (Math.round(investment*Math.pow((1 + (interest/1200)), (years*12)))));
        System.out.println("future value is "+future);
        //System.out.format(miles+" miles is "+km+" kilometers", "%.2f", km);
        ui.close();
    }
}
