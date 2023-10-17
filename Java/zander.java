import java.util.Scanner;
import java.util.ArrayList;
public class zander {
    public static void main(String[] args) {
        // Create an ArrayList to store pet names
        ArrayList<String> petList = new ArrayList<String>();
        // Create a Scanner object to read user input
        Scanner ui = new Scanner(System.in);
        String userInput = "";
        // Main loop for interacting with the user
        while (!userInput.equals("q")) {
            // Display the available actions
            System.out.println("What would you like to do? (a)dd, (i)nsert, (r)emove, Re(p)lace, (c)lear, (v)iew, or (q)uit");
            userInput = ui.nextLine();
            if (userInput.equals("a")) {
                // Add a pet to the list
                System.out.println("Enter the name of the pet: ");
                String petName = ui.nextLine();
                petList.add(petName);
                System.out.println("Successfully added: " + petName);
            } else if (userInput.equals("i")) {
                // Insert a pet at a specific index
                System.out.println("Enter the name of the pet to insert: ");
                String petName = ui.nextLine();
                System.out.println("Enter the index to insert the pet: ");
                int index = Integer.parseInt(ui.nextLine());
                if (index >= 0 && index <= petList.size()) {
                    petList.add(index, petName);
                    System.out.println("Successfully inserted: " + petName);
                } else {
                    System.out.println("Invalid index. Pet not inserted.");
                }
            } else if (userInput.equals("r")) {
                // Remove a pet by name
                System.out.println("Enter the name of the pet to remove: ");
                String petName = ui.nextLine();
                if (petList.remove(petName)) {
                    System.out.println("Successfully removed: " + petName);
                } else {
                    System.out.println("Pet not found in the list.");
                }
            } else if (userInput.equals("p")) {
                // Replace a pet's name
                System.out.println("Enter the name of the pet to replace: ");
                String oldPetName = ui.nextLine();
                int index = petList.indexOf(oldPetName);
                if (index != -1) {
                    System.out.println("Enter the new name for the pet: ");
                    String newPetName = ui.nextLine();
                    petList.set(index, newPetName);
                    System.out.println("Successfully replaced " + oldPetName + " with " + newPetName);
                } else {
                    System.out.println("Pet not found in the list.");
                }
            } else if (userInput.equals("c")) {
                // Clear the entire pet list
                petList.clear();
                System.out.println("All pet information cleared.");
            } else if (userInput.equals("v")) {
                // View the list of pets
                System.out.println("Pet List:");
                for (String pet : petList) {
                    System.out.println(pet);
                }
            } else if (!userInput.equals("q")) {
                // Handle invalid input
                System.out.println("Please select a valid option.");
            }
        }
        // End of the program
        System.out.println("bye bye");
    }
} 