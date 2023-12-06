public class Chipmunk extends Animal implements Walking {
    public Chipmunk(){
        super("Taylor Blythe","John...  I don't get it");
    }
    @Override
    public String walk(){
        return "Chipmunk is walking";
    }
    @Override
    public String makeNoise(){
        return "chip chip";
    }
}
