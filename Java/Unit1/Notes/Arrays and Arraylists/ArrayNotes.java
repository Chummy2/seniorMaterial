import java.util.Scanner;

public class ArrayNotes {
    public static void main(String[] args) {
        /**
         * Primitive - ints, doubles, floats, char, boolean
         * non-primitive - Strings, list , arrays, arraylist, objects, maps, json
        */

        //pythonic list -> listy=[0,1,2,3,4,5,6,7,8,9]
        int[] intNumbers ={0,1,2,3,4,5,6,7,8,9};
        double[] decimalNumbers = {0.0,1,2.5,3.14,4.56};
        //double cannot go into a int  but a int can go into a double    }   

        String[] words={"Hello"," ","World"};
        //System.out.println(intNumbers);
        //for (int i=0;i<intNumbers.length;i++){
        //    System.out.println(intNumbers[i]);
        //}
        //for (int i=0;i<words.length;i++){
        //    System.out.print(words[i]);
        //}
        printHorizontalArray(intNumbers);
        printVerticalArray(intNumbers);
        printHorizontalArray(intNumbers,",");
        int[] userNumbers=new int[10];
        String[] a = new String[10];
        Scanner ui = new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.println("enter 10 numbers");
            userNumbers[i]=ui.nextInt();
        }
        System.out.println(minIntArray(userNumbers));
        System.out.println(maxIntArray(userNumbers));
        System.out.println(aveIntArray(userNumbers));
        System.out.println(sumIntArray(userNumbers));

}
    public static int minIntArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int maxIntArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int sumIntArray(int[] arr){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        return total;
    }
    public static double aveIntArray(int[] arr){
        double ave = sumIntArray(arr)/arr.length;
        return ave;
    }
    public static void printHorizontalArray(int[] arr){
            for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        }
    private static void printHorizontalArray(int[] arr,String d){
        String out ="";    
        for (int i=0;i<arr.length;i++){
                if(i!=arr.length-1){
                    out+=arr[i];
                    out+=d;
                }
                else{
                    out+=arr[i];
                }

        }
        }
}
