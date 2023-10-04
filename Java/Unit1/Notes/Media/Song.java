public class Song {
    String title;
    String artist;
    double rating;
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
    public Song(String name, String artist, double rating){
        //this.globalvar = localvar
        this.title =name;
        this.artist =artist;
        this.rating=rating;
    }
    public void setRating(double newRating){
        this.rating=newRating;
    }
    public double getRating(){
        return this.rating;
    }
    public void setTitle(String newTitle){
        this.title=newTitle;
    }
    public String getTitle(){
        return this.title;
    }

    @Override
    public String toString() {
        String out="";
        out+="Title: "+this.title;
        out+="\nArtist: "+this.artist;
        out+="\nRating: "+this.rating;
        out+="\n";
        return out;
    }
}
