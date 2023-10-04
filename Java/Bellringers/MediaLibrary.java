import java.util.ArrayList;
public class MediaLibrary {
    private static ArrayList<Song> myPlayList = new ArrayList<Song>();
    public static void main(String[] args) {            //MediaLibrary.main(string[] args)
        Song firstSong = new Song("Lie","NF");
        Song secondSong = new Song("Bullet","NF");
        Song thirdSong = new Song("Let You Down","NF");
        myPlayList.add(firstSong);myPlayList.add(secondSong);myPlayList.add(thirdSong);
        System.out.println(myPlayList);
    }
}
