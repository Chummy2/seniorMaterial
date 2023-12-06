//Blake Brucken
public class Turtle extends Animal implements Swimming{
    public Turtle(){
        super("Crush","Lets chillllll mannnn");
    }
    @Override
    public String swim(){
        return "Turtle is swimming";
    }
    @Override
    public String makeNoise(){
        return "Glug Glug";
    }
}
