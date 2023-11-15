//Blake Brucken
public class GoldFish extends Animal implements Swimming {
    public GoldFish(){
        super("Nemo","Forgot what happened 5 seconds ago");
    }
    @Override
    public String swim(){
        return "GoldFish is swimming";
    }
    @Override
    public String makeNoise(){
        return "Glug Glug";
    }
}
