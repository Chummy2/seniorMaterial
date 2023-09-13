import java.util.Scanner;
public class LoopyStrings{
    public static void main(String[] args) {
    System.out.println(spaceReplacer("this is a  double"));
    System.out.println(removeVowels("banana"));
    System.out.println(replaceStuff("i like potatoes with potato tots and potato cakes"));
    }
    public static String spaceReplacer(String a){
        for(int p=0;p!=a.length()-1;p++){
            char chart = a.charAt(p);
            char chart2 = a.charAt(p+1);
            if(chart==' '&&chart2==' '){
                a = a.substring(0,p)+a.substring(p+1,a.length());
            }
        }
        return a;

   }

   public static String removeVowels(String input){
    String output = "";
    input=input.toLowerCase();
    for(int x=0;x!=input.length();x++){
         if (input.substring(x,x+1).equals("a") || input.substring(x,x+1).equals("e") || input.substring(x,x+1).equals("i") || input.substring(x,x+1).equals("o") || input.substring(x,x+1).equals("u") ){
              System.out.print("");
         } 
         else {
              output += input.substring(x,x+1).toUpperCase();
         }
    }
    return output;
}
    public static String replaceStuff(String phrase,String wordToFind, String wordToReplace){
        String out="";
        int beginIndex=0;
        System.out.println(phrase.indexOf(wordToFind));
        out=phrase.substring(0, phrase.indexOf(wordToFind));
        out+=wordToReplace;
        beginIndex=phrase.indexOf(wordToFind)+wordToFind.length();
        System.out.println(beginIndex);
        out+=(phrase.substring(beginIndex, phase.indexOf(wordToFind))+wordToReplace);
        beginIndex=phrase.indexOf(wordToFind)+wordToFind.length();



        return out;
    }
}


