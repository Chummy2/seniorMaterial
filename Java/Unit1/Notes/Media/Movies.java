public class Movies {
    //field var
        String title;
        String author;
        double rating;
        public Movies(){
    
        }
        //constructor signature
        public Movies(String title){
            //this.globalvar = localvar
            this.title =title;
        }
    
        public Movies(String title, String authors){
            //this.globalvar = localvar
            this.title=title;
            this.author=authors;
        }
        public Movies(String title, String authors, double rate){
            //this.globalvar = localvar
            this.title=title;
            this.author=authors;
            this.rating=rate;
        }

        //getters and setters
        //accessors a ndmutators 
        //will have a getter and setter for each field variable
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
            out+="\nDirector: "+this.author;
            out+="\nRating: "+this.rating;
            out+="\n";
            return out;
        }
    
    
}
