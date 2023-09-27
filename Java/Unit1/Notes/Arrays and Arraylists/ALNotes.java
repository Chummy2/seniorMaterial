import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ALNotes {
    public static void main(String[] args) {
        
        //python list -> listy=[]
        //int[] numbers = new int[10];
        //int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //Class<datatype> objname = new Constructor<DataType>();
        


        //4 main functions of SQL -> CRUD
        //Create or add
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jonah");
        names.add("Zander");
        names.add("Ben");
        names.add("Parker");
        names.add("Ty");
        names.add(2, "Blake");
        //Read
        System.out.println(names);
        System.out.println(names.get(4));

        //Update
        names.set(1, "Owen");

        //Delete
        names.remove("Owen");
        names.remove("Blake");
        System.out.println(names);
        names.clear();

        //lenght of my arraylist
        System.out.println(names.size());

        ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("7");
        nums.add("8");
        nums.add("9");
        nums.add("\n"+"4");
        nums.add("5");
        nums.add("6");
        nums.add("\n"+"1");
        nums.add("2");
        nums.add("3");
        board.add(nums);
        System.out.println(board);
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                System.out.print(board.get(r).get(c)+"\s");
            }
            System.out.println();
        }
    }
    
}
