import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
public class BufferWriter {

    //global var -priv for this class only
    private static Scanner in;
    private static BufferedWriter out;
    private static final String DATA_FILE = "mymedia.txt";

    public static void writeString(String s) {
        //if bufferwriter obj is already created,
        //yo are accessing mult files named the same thing
        if(out==null){
            //since we are going outside of our file
            try{
                out = new BufferedWriter(new FileWriter(DATA_FILE));
            }
            catch(Exception e){//exception class is a general error reporting
                System.err.println("cannot open file for output!");
                e.printStackTrace();
            }
        }

        try{
            out.write(s);
            out.newLine();
        }
        catch(Exception e){
            System.err.println("cannot open file for output!");
            e.printStackTrace();
        }
    }


    public static void saveAndClose(){
        if(in!=null){
            try{
                in.close();
                in=null;
            }
            catch(Exception e){
                System.err.println("cannot open file for output!");
                e.printStackTrace();
            }

        }
    }

    public static String readString(){
        if(in==null){
            try{
                in = new Scanner(new File(DATA_FILE));
            }
            catch(Exception e){
                System.err.println("cannot open file for output!");
                e.printStackTrace();
            }
        }
        try{
            if(in.hasNext()){
                String s = in.nextLine();
                return s;
            }
            else{
                return null;
            }
        }
        catch(Exception e){
                System.err.println("cannot open file for output!");
                e.printStackTrace();
            }
    
        return null;

    }
}
