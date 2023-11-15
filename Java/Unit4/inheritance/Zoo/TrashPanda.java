//Blake Brucken
public class TrashPanda extends Animal implements Walking {
    
    public TrashPanda(){
        super("zander Gumula","Trash lover from Taco Bell in Newburgh");
    }
    @Override
    public String walk(){
        return "TrashPanda is walking";
    }
    @Override
    public String makeNoise(){
        return "Chomp Chomp";
    }
}
