import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter a number");
        Integer number = ui.nextInt();
        System.out.println("Enter a math operator +,-,*,/");
        String operator = ui.next();
        System.out.println("Enter a number");
        Integer number2 = ui.nextInt();
        if (operator.equals("+")){
            System.out.println(+number+number2);
        } 
        else if(operator.equals("-")){
                System.out.println(+number-number2);
        }
        else if(operator.equals("*")){
                System.out.println(+number*number2);
        }
        else if(operator.equals("/")){
                System.out.println(+number/number2);
        }
        ui.close();
    }
}
