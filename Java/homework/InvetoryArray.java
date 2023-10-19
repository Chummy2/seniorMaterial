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
                System.out.println("Enter pet name to add:");
                petList= ui.nextLine();
                currentSize++;
            } else if (userInput.equals("i")) {
                System.out.println("Enter a number to insert into:");
                int index = ui.nextInt();
                System.out.println("Enter a pet name to insert:");
                String name = ui.next();
                if (index >= 0 && index < currentSize) {
                    //https://stackoverflow.com/questions/11638123/how-to-add-an-element-to-array-and-shift-indexes - Where I found arraycopy third comment
                    //https://www.geeksforgeeks.org/system-arraycopy-in-java/
                    //https://chat.openai.com/share/716d6154-132a-4f37-9a45-16080982d470
                    //geeks was not explaining enough lol
                    System.arraycopy(petList, index, petList, index + 1, currentSize - index);
                    petList[index] = name;
                    currentSize++;
                } else {
                    System.out.println("Invalid number!");
                }
            } else if (userInput.equals("r")) {
                System.out.println("Enter number of pet to remove:");
                int index = ui.nextInt();
                if (index >= 0 && index < currentSize) {
                    System.arraycopy(petList, index + 1, petList, index, currentSize - index - 1);
                    currentSize--;
                } else {
                    System.out.println("Invalid number!");
                }
            } else if (userInput.equals("p")) {
                System.out.println("Enter number to replace:");
                int index = ui.nextInt();
                System.out.println("Enter a pet name to replace:");
                String name = ui.next();
                if (index >= 0 && index < currentSize) {
                    petList[index] = name;
                } else {
                    System.out.println("Invalid number!");
                }
                //fixed error idk really how
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
