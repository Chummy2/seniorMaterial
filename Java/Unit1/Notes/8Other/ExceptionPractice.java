import java.lang.reflect.Array;
import java.util.Scanner;

public class ExceptionPractice {

     public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        int a[] = new int[2];

        try{
            System.out.println("which item?");
            int item = ui.nextInt();
            System.out.println(a[item]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Only choose a item in the list");
        }

        finally{
            System.out.println(("finally block executed"));
            for(int item:a){
                System.out.println(item);
            }
        }

    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //while (true){
        //int number;
        //int number2;
        //Scanner ui = new Scanner(System.in);
        //try to do
        //try{
        //System.out.println("Enter first number");
        //number =ui.nextInt();
        //System.out.println("Enter second number");
        //number2 =ui.nextInt();
        //System.out.println(number/number2);}
        //exception of in case something goes wrong
        //catch(Exception e){
        //    System.out.println(e);
        //}
        //finally whatever we do, do this
    //}
        //System.out.println("the rest of the code ");
     //}
