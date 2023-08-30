import java.util.Scanner;

public class madLib {
    public static void main(String[] args) {
     Scanner ui = new Scanner(System.in);
        System.out.println("Enter a Adjective");
        String adj = ui.next();
        System.out.println("Enter a Noun");
        String noun = ui.next();
        System.out.println("Enter a Verb(past tense)");
        String verb = ui.next();
        System.out.println("Enter a Adverb");
        String adverb = ui.next(); 
        System.out.println("Enter a Place");
        String place = ui.next();
        System.out.println("Enter a Noun(plural)");
        String noun2 = ui.next();
        System.out.println("Enter a Verb ending in -ing");
        String verb2 = ui.next();
        System.out.println("Enter a Adjective");
        String adverb2 = ui.next();  
        System.out.println("Enter a emotion");
        String emotion = ui.next();
        System.out.println("Enter a Noun");
        String noun3 = ui.next();    
        System.out.println("Once upon a(n) "+adj+" night in Gotham City, Batman received an urgent call on his "+noun+"-signal. Without hesitation, he "+verb+" to the Batcave at lightning speed, "+adverb+" maneuvering through the dark streets. At the Batcave, Alfred greeted Batman with a worried expression. Master Wayne, he said, a group of "+place+" -dwellers have stolen a shipment of precious "+noun2+" They are "+verb2+" havoc throughout the city, and the citizens are feeling "+adverb2+" about it. Batman's "+emotion+" surged, and he swiftly suited up in his iconic "+noun3+" ready to bring justice to the chaos-stricken streets of Gotham. With the Batmobile roaring to life, he sped off into the night, determined to restore peace and retrieve the stolen treasures. As he soared between skyscrapers and leapt from rooftop to rooftop, Batman's unyielding determination showed that even in the face of the most "+adj+" challenges, he would always be the guardian Gotham needed.");
    }
}
