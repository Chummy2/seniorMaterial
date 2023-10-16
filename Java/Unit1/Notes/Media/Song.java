public class Song {
    String name;
    String artist;
    double rating,duration;
    public Song(){

    }
    //constructor signature
    public Song(String title){
        //this.globalvar = localvar
        this.name =title;
    }

    public Song(String title, String artist){
        //this.globalvar = localvar
        this.name =title;
        this.artist =artist;
    }
    public Song(String title, String artist, double rating){
        //this.globalvar = localvar
        this.name =title;
        this.artist =artist;
        this.rating=rating;
    }
    public Song(String title, String artist, double rating, double time){
        //this.globalvar = localvar
        this.name =title;
        this.artist =artist;
        this.rating=rating;
        this.duration = time;
    }
    public void setRating(double newRating){
        this.rating=newRating;
    }
    public double getRating(){
        return this.rating;
    }
    public void setArtist(String newArtist){
        this.artist=newArtist;
    }
    public String getArtist(){
        return this.artist;
    }
    public void setname(String newtitle){
        this.name=newtitle;
    }
    public String getName(){
        return this.name;
    }
    public void setDuration(double newDuration){
        this.duration=newDuration;
    }
    public double getDuration(){
        return this.duration;
    }

    @Override
    public String toString() {
        String out="";
        out+="title: "+this.name;
        out+="\nArtist: "+this.artist;
        out+="\nRating: "+this.rating;
        out+="\nDuration: "+this.duration;
        out+="\n";
        return out;
    }
}
