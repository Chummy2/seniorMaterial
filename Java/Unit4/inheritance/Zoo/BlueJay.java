//Blake Brucken
public class BlueJay extends Bird implements Flying{
    public BlueJay(){
        super("johnny","Baseball");
    }
    @Override
    public String fly(){
        return "Blue Jay is Rotating";
    }
    public String poop(){
        return "Poop is everywhere";
    }
}
