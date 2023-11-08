import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        //program that keeps track of the animals at the Vet
        //   add, insert, remove, replace, clear the db    }
        // if the user types in quit -> the program ends
        ArrayList<String> petList = new ArrayList<String>();
        Scanner ui = new Scanner(System.in);
        String userInput = "";

        while(!userInput.equals("q")){
            System.out.println("what would you like to do? (a)dd,(i)nsert,(r)emove,Re(p)lace,(c)lear,(v)iew, or (q)uit");
            userInput = ui.nextLine();

            if(userInput.equals("a")){
                System.out.println("Enter a pet name to add:");
                petList.add(ui.nextLine());
            }
            else if(userInput.equals("i")){
                System.out.println("Enter a number to insert into:");
                int Number = ui.nextInt();
                if (Number >= 0 && Number < petList.size()) {
                    System.out.println("Enter a pet name to insert:");
                    String name = ui.next();
                    petList.add(Number, name);
                }
                 else {
                    System.out.println("Please enter a correct number");
                }
            }
            else if(userInput.equals("r")){
                System.out.println("Enter number of the pet to remove:");
                int Number = ui.nextInt();
                if(Number >= 0 && Number < petList.size()){
                    petList.remove(Number);
                } else{
                    System.out.println("Please enter a correct number");
                }
            }
            else if(userInput.equals("p")){
                System.out.println("Enter number of pet to replace:");
                int Number = ui.nextInt();
                System.out.println("Enter name of pet to replace:");
                String name = ui.next();
                if(Number < petList.size()){
                    petList.set(Number, name);
                } else{
                    System.out.println("Please enter a correct number");
                }
            }
            else if(userInput.equals("c")){
                petList.clear();
            }
            else if(userInput.equals("v")){
                if (petList.isEmpty()){
                    System.out.println("The list is empty");
                }
                else{
                    System.out.println("Pets in Inventory:");
                    for(int i=0; i<petList.size(); i++){
                        System.out.println(i + ": " + petList.get(i));
                }}
            }
            else{
                System.out.println("Please choose a correct answer");
            }
        }
        System.out.println("Bye Bye");

}}
