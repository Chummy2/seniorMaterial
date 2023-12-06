//Blake Brucken
public class Whale extends Animal implements Swimming {
    public Whale(){
        super("Bob","Unda the sea");
    }
    @Override
    public String swim(){
        return "Whale is swimming";
    }
    @Override
    public String makeNoise(){
        return "Glug Glug";
    }
}
