import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
//https://www.digitalocean.com/community/tutorials/shuffle-array-java
//https://www.javatpoint.com/java-ascii-table
public class PasswordGenerator extends PasswordManager {
    public static String password() {
        List<Character> finalPassword = new ArrayList<>();

        int upperPassword = new Random().nextInt(3) + 2;
        for (int i = 0; i < upperPassword; i++) {
            finalPassword.add((char) (new Random().nextInt(26) + 65));
        }

        int lowerPassword = new Random().nextInt(3) + 2;
        for (int i = 0; i < lowerPassword; i++) {
            finalPassword.add((char) (new Random().nextInt(26) + 97));
        }

        int numberPassword = new Random().nextInt(3) + 2;
        for (int i = 0; i < numberPassword; i++) {
            finalPassword.add((char) (new Random().nextInt(10) + 48));
        }

        String realSpecialPassword = "!@#$%^&*()";
        int specialPassword = new Random().nextInt(3) + 2;
        for (int i = 0; i < specialPassword; i++) {
            finalPassword.add(realSpecialPassword.charAt(new Random().nextInt(9)));
        }

        Collections.shuffle(finalPassword);

        StringBuilder output = new StringBuilder();
        for (Character character : finalPassword) {
            output.append(character);
        }

        return output.toString();
    }
}
