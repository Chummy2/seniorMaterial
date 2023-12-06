//Blake Brucken
public class Eagle extends Bird implements Flying{
    public Eagle(){
        super("Merica","JULYYY 4TTHTHTHTH");
    }

    @Override
    public String fly(){
        return "Eagle is Rotating";
    }
    public String poop(){
        return "Poop is everywhere";
    }
}