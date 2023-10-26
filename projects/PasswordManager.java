import java.util.Scanner;
public class PasswordManager {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        String userInput = "";
        String userName = "";
        String password = "";
        String mainDone = "no";
        String passwordDone = "no";
        String loginDone = "no";
        Integer attempts=0;
        while (!mainDone.equals("yes")){
            System.out.println("(C)reate account or (S)ign in?");
            userInput = ui.nextLine();
            if (userInput.equalsIgnoreCase("c")){
                System.out.println("What username do you want?");
                userName = ui.nextLine();
                while (!passwordDone.equals("yes")){
                    System.out.println("Do you want a (G)enerated password or do you want to (C)reate you own?");
                    userInput = ui.nextLine();
                    if (userInput.equalsIgnoreCase("g")){
                        passwordDone="yes";
                    }
                    else if (userInput.equalsIgnoreCase("c")){
                        System.out.println("What password do you want?");
                        password = ui.nextLine();
                        passwordDone="yes";
                    }
                }
            }
            else if(userInput.equalsIgnoreCase("s")){
                while(!loginDone.equals("yes")){
                    if (attempts.equals(3)){
                        System.out.println("You have entered the wrong password to many times.");
                        System.out.println("Goodbye");
                        loginDone="yes";
                        mainDone="yes";
                    }
                    else{
                        System.out.println("What is your username?");
                        userName = ui.nextLine();
                        System.out.println("What is your password?");
                        password = ui.nextLine();
                        if (!userName.equals("bob") && !password.equals("hi")){
                            System.out.println("Wrong info");
                            attempts+=1;
                        }
                        else if (userName.equals("bob") && password.equals("hi")){
                            System.out.println("welcome");

                        }
                    }
                }
            }
        }
    }
}
