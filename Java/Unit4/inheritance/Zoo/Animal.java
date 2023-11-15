public abstract class Animal {
    private String name,desc;

    public Animal(String name, String description){
        this.name = name;
        this.desc = description;
    }

    public String getName(){
        return name;
    }
    public String getDesc(){
        return desc;
    }
    public abstract String makeNoise();
}
