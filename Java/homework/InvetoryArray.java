import java.util.Scanner;
import java.util.Arrays;

public class Inventory {
    public static void main(String[] args) {
        String[] petList = new String[100];
        Scanner ui = new Scanner(System.in);
        String userInput = "";
        int currentSize = 0;

        while (!userInput.equals("q")) {
            System.out.println("What would you like to do? (a)dd, (i)nsert, (r)emove, Re(p)lace, (c)lear, (v)iew, or (q)uit");
            userInput = ui.nextLine();
            if (userInput.equals("a")) {
                System.out.println("Enter a pet name to add:");
                petList[currentSize] = ui.nextLine();
                currentSize++;
            } else if (userInput.equals("i")) {
                System.out.println("Enter a number to insert into:");
                int Number = ui.nextInt();
                System.out.println("Enter a pet name to insert:");
                String name = ui.next();
                if (Number >= 0 && Number < currentSize) {
                    //https://stackoverflow.com/questions/11638123/how-to-add-an-element-to-array-and-shift-Numberes - Where I found arraycopy third comment
                    //https://www.geeksforgeeks.org/system-arraycopy-in-java/
                    //https://chat.openai.com/share/716d6154-132a-4f37-9a45-16080982d470
                    //geeks was not explaining enough lol
                    petList[Number] = name;
                    currentSize++;
                } else {
                    System.out.println("Please enter a correct number");
                }
            } else if (userInput.equals("r")) {
                System.out.println("Enter number of the pet to remove:");
                int Number = ui.nextInt();
                if (Number >= 0 && Number < currentSize) {
                    System.arraycopy(petList, Number + 1, petList, Number, currentSize - Number - 1);
                    currentSize--;
                } else {
                    System.out.println("Please enter a correct number");
                }
            } else if (userInput.equals("p")) {
                System.out.println("Enter number of pet to replace:");
                int Number = ui.nextInt();
                System.out.println("Enter name of pet to replace:");
                String name = ui.next();
                if (Number >= 0 && Number < currentSize) {
                    petList[Number] = name;
                } else {
                    System.out.println("Please enter a correct number");
                }
                //fixed error idk really know how
                ui.nextLine();
            } else if (userInput.equals("c")) {
                Arrays.fill(petList, null);
                currentSize = 0;
            } else if (userInput.equals("v")) {
                System.out.println("Pets in Inventory:");
                for (int i = 0; i < currentSize; i++) {
                    System.out.println(i + ". " + petList[i]);
                }
            } else if (!userInput.equals("q")) {
                System.out.println("Please choose a correct answer");
            }
        }
        System.out.println("bye bye");
        ui.close();
    }
}
