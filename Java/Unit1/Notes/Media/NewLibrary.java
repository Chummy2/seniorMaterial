import java.util.ArrayList;
public class NewLibrary{
    public static void main(String[] args) {
        ArrayList<Song> myPlayList = new ArrayList<Song>();

        myPlayList.add(new Song("Hold Up", "Pohl",10,5));
        myPlayList.add(new Song("Hmm Hmm Hmm", "TyMan",6,8));
        myPlayList.add(new Song("Blake Blucken", "Chick FIlled A",1,1.5));
        myPlayList.add(new Song("Star Wars Last Jedi", "Georgy Porgy",1,3+36.0/60));
        myPlayList.add(new Song("Blake Blucken", "Chick FIlled A",1,1.5));
        myPlayList.add(new Song("Red", "Spinny Chair",9.9,3+47.0/60));

        System.out.println(myPlayList);

        double durationOfPlaylist=0.0;
        for(int i=0;i<myPlayList.size();i++){
            durationOfPlaylist+=myPlayList.get(i).getDuration();
        }
        System.out.println(durationOfPlaylist+"minutes of playlist");

        System.out.println(durationOfPlaylist/myPlayList.size()+"average length of songs");
    }
}