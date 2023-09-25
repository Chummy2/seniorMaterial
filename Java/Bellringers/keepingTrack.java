import java.util.Scanner;

public class keepingTrack {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in); 
        String done="no";
        String reallyDone="";
        while (!done.equals("yes")) {
            System.out.println("Enter a number");
            String work = ui.next();
            if (!work.equalsIgnoreCase("quit"))
                reallyDone+=work+"\n";
            else if (work.equalsIgnoreCase("quit"))    
                done="yes";
        }
        ui.close();
        System.out.println(reallyDone);
    }
}

