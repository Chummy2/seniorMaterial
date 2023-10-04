public class Song {
    String title;
    String artist;
    public Song(){

    }
    //constructor signature
    public Song(String title){
        //this.globalvar = localvar
        this.title =title;
    }

    public Song(String name, String artist){
        //this.globalvar = localvar
        this.title =name;
        this.artist =artist;
    }
    

    @Override
    public String toString() {
        String out="";
        out+="Title: "+this.title;
        out+="\nArtist: "+this.artist;
        out+="\n";
        return out;
    }
}
