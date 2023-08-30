import java.util.Scanner;

public class LoopityLoop {
    public static void main(String[] args) {
        //for and while loops
        //python a while loop looked like
        // while (boolean statement==true):
        // do this algorithm
        // while(PlayerALive):
        // while(PlayerIsAlive):
        // while(userInput.isDigit()):

        //print out the numbers 0-9
        //int x=0;
        //while(x!=10){
         //   System.out.println(x);
        //    x++;
        //}
        //int x=1;
        //double denom=1;
        //double total=0;
        //while(x!=101){
        //    total+=(1/denom);
        //    System.out.printf("1/%s\n",denom);
        //    denom*=2;
         //   x++;
        //}
        //Scanner ui = new Scanner(System.in);
        //String what = "";
        ///while (!what.equals("chicken butt")){
        //    System.out.println("Guess what");
        //    what = ui.next();
        //}
        //System.out.println("hHEHEHE");
        //for(int x=0;x!=10;x=x+2){
        //    System.out.println(x);
        //}
        //for(int x=0;x!=22;x=x+2){
        //    System.out.println(x);
        //}
        //for(int x=1;x!=21;x=x+2){
        //    System.out.println(x);
        //}
        //for(int x=0;x!=10;x++){
        //    System.out.print(x+",");
        //}
        //for(int x=9;x!=-1;x=x-1){
           // System.out.print(x);
         //   if (x>0){
            //    System.out.print(",");
          //  }
        //}
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
        }
}}
