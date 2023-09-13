import java.util.Scanner;
public class additonProgram{
    public static void main(String[] args) {
    Double firstNum=0.0;
    while (true){
        Scanner ui = new Scanner(System.in);
        System.out.println("enter a number to add up them up or type quit to quit");
        String work = ui.next();
        if (work.equals("quit")) {
            break;
        } else { 
            firstNum+=(Double.parseDouble(work));
        }
    }
    
    System.out.println(firstNum);
    }
}