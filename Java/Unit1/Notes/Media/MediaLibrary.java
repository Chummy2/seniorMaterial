import java.util.ArrayList;
import java.util.Scanner;
public class MediaLibrary {
    private static ArrayList<Song> myPlayList = new ArrayList<Song>();
    private static ArrayList<Book> myBookShelf = new ArrayList<Book>();
    private static ArrayList<Movies> myMovies = new ArrayList<Movies>();
    public static void main(String[] args) {            //MediaLibrary.main(string[] args)
        Song firstSong = new Song("Lie","NF");
        Song secondSong = new Song("Bullet","NF");
        Song thirdSong = new Song("Let You Down","NF");
        myPlayList.add(firstSong);myPlayList.add(secondSong);myPlayList.add(thirdSong);  
        printPlaylist(myPlayList); 
        firstSong.setTitle("Wheels on Da Bus");
        firstSong.setRating(1);
        myPlayList.get(1).setRating(5);
        myPlayList.get(2).setRating(10);
        printPlaylist(myPlayList);

        addSong();
        addSong();
        printPlaylist(myPlayList);

        printAveRating(myPlayList);

        System.out.println(findASong());
        //find a song based on input and return song
        myBookShelf.add(new Book("Percy Jackson and The Lightning Thief ","Rick Riordan",10));
        myBookShelf.add(new Book("The Kane Chronicles: The Red Pyramid","Rick Riordan",9));
        myBookShelf.add(new Book("Magnus Chase and The Ship of the Dead","Rick Riordan",9));
        printShelf(myBookShelf);
        myMovies.add(new Movies("Scary Movie ","some guy",9));
        myMovies.add(new Movies("9","amazing guy",10));
        myMovies.add(new Movies("Courpse Bride","Tim Burton",9));
        printMovies(myMovies);
    }
    private static void printPlaylist(ArrayList<Song> arr){
        for(int i=0;i<arr.size();i++){
             System.out.println(arr.get(i));
        }
   }
   private static void printShelf(ArrayList<Book> arr){
        for(int i=0;i<arr.size();i++){
             System.out.println(arr.get(i));
        }
}
     private static void printMovies(ArrayList<Movies> arr){
        for(int i=0;i<arr.size();i++){
             System.out.println(arr.get(i));
        }
}
    private static void addSong(){
        Scanner ui = new Scanner(System.in);
        String n =ui.nextLine();
        String a =ui.nextLine();
        Double r =ui.nextDouble();
        myPlayList.add(new Song(n,a,r));
    }
    private static void printAveRating(ArrayList<Song>arr){
        double average = 0.0;
        double sum =0.0;
        for (int i=0;i<arr.size ();i++){u7jnm
            sum+=arr.get(i).getRating();
        }
        average=sum/arr.size();
        System.out.println(average);
    }
    private static Song findASong(){
        Scanner ui = new Scanner(System.in);
        System.out.println("What song do you want");
        String name =ui.nextLine();
        for (int i=0;i<myPlayList.size();i++){
            if (myPlayList.get(i).equals(name)){
                return myPlayList.get(i);
            }
        }
        return new Song();
    }
}
