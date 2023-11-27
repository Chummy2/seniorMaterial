import java.util.Scanner;
public class CustomException {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        int age = ui.nextInt();
        try{
        validateAge(age);}
        catch(InvalidAgeException e){
            System.out.println(e);
        }
    }

    class InvalidAgeException extends Exception{
        public InvalidAgeException(String s){
            super(s);
        }
    }
    public class TestCustomException1 {
    public static void validate(int age) throws InvalidAgeException{
        if (age<65){
            throw new InvalidAgeException("Oops you're not old enough");
        }
        else{
            System.out.println("Congrats you can order off of the senior menu");
        }
    }
        
    }
}
