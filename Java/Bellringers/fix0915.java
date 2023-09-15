public class fix0915 {
    public static void main(String[] args) {
        System.out.println(replaceStuff("I like potatoes with a side of potato sauce", "potato", "poop"));
    }
    private static String replaceStuff(String s, String f, String r){
            //while loop to find all of the "  "
            int index = s.indexOf(f);
            while(index != -1){         //loop while indexOf(f) finds an f
                s = s.substring(0, index) + r + s.substring(index + f.length()); 
                index = s.indexOf(f, index + r.length());
            }
            return s;
       }
}
