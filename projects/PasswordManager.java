import java.util.Scanner;
public class PasswordManager {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        String userInput = "";
        String userName = "";
        String password = "";
        System.out.println("(C)reate account or (S)ign in?");
        userInput = ui.nextLine();
        if (userInput.equalsIgnoreCase("c")){
            System.out.println("What username do you want?");
            userName = ui.nextLine();
            System.out.println("Do you want a (G)enerated password or do you want to (C)reate you own?");
            userInput = ui.nextLine();
            if (userInput.equalsIgnoreCase("g")){
                //placeholder
            }
            else if (userInput.equalsIgnoreCase("c")){
                System.out.println("What password do you want?");
                password = ui.nextLine();
        }
    
        }
}
}
