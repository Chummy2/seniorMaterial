import java.util.Scanner;
import java.util.Random;
public class SciFiName {
     public static void main(String[] args) {
          /*Take in user input for the following information
               FirstName
               LastName
               City
               School
               Pets Name
               Sibling Name
          Print the info to test if it works
          */
          Scanner ui = new Scanner(System.in);

          System.out.println("First Name: ");
          String first = ui.nextLine();
          System.out.println("Last Name: ");
          String last = ui.nextLine();
          System.out.println("City: ");
          String city = ui.nextLine();
          System.out.println("School: ");
          String school = ui.nextLine();
          System.out.println("Pet Name: ");
          String pet = ui.nextLine();
          System.out.println("Sib Name: ");
          String sibling = ui.nextLine();

          System.out.printf("%s,%s,%s,%s,%s,%s\n",first,last,city,school,pet,sibling);
          
          /*
           * SciFi Name Generator
           * SciFiFirstName = a portion of the FirstName and LastName
           * SciFiLastName = a portion of the City and School
           * SciFiOrigin = a portion of the PetName and SiblingName
           * 
           * prints out >> SciFiFirstName SciFiLastName from the planet SciFiOrigin
           * 
           * a portion means a random portion of that String
           *   because we need this name to be a unique name, so each time
           *   you run the program a new name will be generated
           */

          Random randy = new Random();
          int firstPortion = randy.nextInt(first.length());
          int lastPortion = randy.nextInt(last.length());
          String scifiFirst = first.substring(0,firstPortion)+last.substring(0,lastPortion);
          firstPortion = randy.nextInt(city.length());
          lastPortion = randy.nextInt(school.length());
          String scifiLast = city.substring(0,firstPortion)+school.substring(0,lastPortion);
          firstPortion = randy.nextInt(pet.length());
          lastPortion = randy.nextInt(sibling.length());
          String scifiOrigin = pet.substring(0,firstPortion)+sibling.substring(0,lastPortion);
          //scifiFirst = first.substring(0,randy.nextInt(first.length()))+last.substring(0,randy.nextInt(last.length()));
          System.out.printf("%s %s of the planet %s", scifiFirst,scifiLast, scifiOrigin);

     }
}
