//Blake Brucken
public class Godzilla extends Animal implements Walking {
    public Godzilla(String name,String desc){
         super(name,desc);
    }
    @Override
    public String walk(){
        return "Godzilla is walking";
    }
    @Override
    public String makeNoise(){
        return "Rawr";
    }
}
