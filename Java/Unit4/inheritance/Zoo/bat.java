//Blake Brucken
public class bat extends Bird implements Flying {
    public bat(){
        super("batty","very blind");
    }
    @Override
    public String fly(){
        return "Bat is Rotating";
    }
    public String poop(){
        return "Poop is everywhere";
    }
}
