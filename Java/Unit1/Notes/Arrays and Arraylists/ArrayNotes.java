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
        System.out.println(intNumbers);
        for (int i=0;i<intNumbers.length;i++){
            System.out.println(intNumbers[i]);
        }
        for (int i=0;i<words.length;i++){
            System.out.print(words[i]);
        }
        printHorizontalArray(intNumbers);
        printVerticalArray(intNumbers);
        printHorizontalArray(intNumbers,",");

}
    public static void printVerticalArray(int[] arr){
            for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
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
