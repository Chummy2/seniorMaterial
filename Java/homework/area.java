import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("enter the coordinatges of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
        double x1= (double)ui.nextDouble();
        double y1= (double)ui.nextDouble();
        double x2=(double) ui.nextDouble();
        double y2=(double) ui.nextDouble();
        double x3= (double)ui.nextDouble();
        double y3= (double)ui.nextDouble();
        double Area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        String finalArea = String.format("%.2f", Area);
        System.out.println("Answer is " + finalArea);
        //System.out.format(miles+" miles is "+km+" kilometers", "%.2f", km);
        ui.close();
    }
}
