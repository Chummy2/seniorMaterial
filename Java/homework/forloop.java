public class forloop {
    public static void main(String[] args) {
       int x=0;
        for(int p=0;p!=3;p++){
            for(int w=2;w>=0;w-=1){
            if(x<8){
               System.out.print(w+",");
                x=x+1;
            }
            else {
                System.out.print(w);
            }
            

        }
}   System.out.println("");
int x2 = 0;
        for (int p2=0;p2<9;p2++) {
            int value = x2 % 3;
            System.out.print(value);

            if (p2 < 8) {
                System.out.print(",");
                x2 = x2 + 1;
            }
}}}
