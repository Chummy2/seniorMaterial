import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("enter the coordinatges of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
        double x1= ui.nextInt();
        double y1= ui.nextDouble();
        double x2= ui.nextDouble();
        double y2= ui.nextDouble();
        double x3= ui.nextDouble();
        double y3= ui.nextDouble();
        System.out.println("answer is "+x1+y1+x2+y2+x3+y3);

        //System.out.format(miles+" miles is "+km+" kilometers", "%.2f", km);
        ui.close();
    }
}
