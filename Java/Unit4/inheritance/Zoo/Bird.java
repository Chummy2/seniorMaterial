public abstract class Bird extends Animal {
    public Bird(){
        super("Bird","Drone");
    }
    public Bird(String name, String desc){
        super(name,desc);
    }
    public abstract String poop();
    

    @Override
    public String makeNoise(){
        return "Tweet Tweet";
    }

}
