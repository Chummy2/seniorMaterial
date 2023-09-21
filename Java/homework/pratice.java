import java.util.HashMap;
public class pratice{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
            map.put("Key 1", 10);
            map.put("Key 2", 20);
            map.put("Key 3", 30);

// Print values associated with specific keys
            System.out.println("Value associated with Key 2: " + map.get("Key 2"));

    }
}