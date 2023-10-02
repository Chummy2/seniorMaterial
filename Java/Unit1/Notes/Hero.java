//DO NOT name this the samething as something build in
public class Hero{
    //YOU DO NOT HAVE A MAIN IN THIS CLASS
    
    String name;
    String superPower;
    //CONSTRUCTORS
    //DEF__INIT__()
    public Hero(){

    }
    //constructor signature
    public Hero(String newName){
        //this.globalvar = localvar
        this.name =newName;
    }

    public Hero(String newName, String power){
        //this.globalvar = localvar
        this.name =newName;
        this.name =power;
    }
    

    @Override
    public String toString() {
        String out="";
        out+="Name: "+this.name;
        if (this.superPower==null){
            out+="\nSuperpower: "+"no powers...... they're lame";
        }
        else{
        out+="\nSuperpower: "+this.superPower;
        }
        out+="\n";
        return out;
    }
}