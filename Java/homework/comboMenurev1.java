import java.util.Scanner;

public class comboMenurev1 {
    public static void main(String[] args) {
    String sandwichDone="no";
    String friesDone="no";
    String drinkDone="no";
    String sandwich="";
    String fries="";
    String drink="";
    String childSize="";
    String ketchupDone="no";
    String sandwichDiscount="no";
    String friesDiscount="no";
    String drinkDiscount="no";
    double cost=0.0;
    Scanner ui = new Scanner(System.in);
    String reallyDone="";
    while (!reallyDone.equals ("yes")){
        while (!sandwichDone.equals ("yes")){
            System.out.println("Do you want a sandwich? (y/n)");
            String wantSandwich=ui.next();
            if (wantSandwich.equalsIgnoreCase("n")){ 
                break;
            }
            else if (wantSandwich.equalsIgnoreCase("y")){
                sandwichDiscount="yes";
                while (!sandwich.matches("cbt")){
                    System.out.println("Please type c or b or t");
                    System.out.println("which sandwich would you like: chicken $5.25, beef $6.25, tofu $5.75)");
                    String realSandwich=ui.next();
                    if (realSandwich.equalsIgnoreCase("c")){
                        cost+=5.25;
                        sandwichDone="yes";
                        System.out.print(cost);
                        break;
                        
                    }
                    if (realSandwich.equalsIgnoreCase("b")){
                        cost+=6.25;
                        sandwichDone="yes";
                        System.out.print(cost);
                        break;
                    }
                    if (realSandwich.equalsIgnoreCase("t")){
                        cost+=5.75;
                        sandwichDone="yes";
                        System.out.print(cost);
                        break;
                    }
                }
            }
            
        }
        while (!friesDone.equals ("yes")){
                System.out.println("Do you want fries? (y/n)");
                String wantFries=ui.next();
                if (wantFries.equalsIgnoreCase("n")){ 
                    break;
                }
                else if (wantFries.equalsIgnoreCase("y")){
                    friesDiscount="yes";
                    while (!fries.matches("cbt")){
                        System.out.println("Please type s or m or l");
                        System.out.println("which fry size would you like: small $1.00, medium $1.50, large $2.00)");
                        String realFries=ui.next();
                        if (realFries.equalsIgnoreCase("s")){
                            cost+=1.00;
                            friesDone="yes";
                            System.out.print(cost);
                            break;
                                
                        }
                        if (realFries.equalsIgnoreCase("m")){
                            cost+=1.75;
                            friesDone="yes";
                            System.out.print(cost);
                            break;
                        }
                        if (realFries.equalsIgnoreCase("l")){
                            cost+=2.25;
                            friesDone="yes";
                            System.out.print(cost);
                            break;
                        }
                        }}}
        while (!drinkDone.equals ("yes")){
            System.out.println("Do you want a drink? (y/n)");
            String wantDrink=ui.next();
            if (wantDrink.equalsIgnoreCase("n")){ 
                    break;
            }
            else if (wantDrink.equalsIgnoreCase("y")){
                drinkDiscount="yes";
                while (!drinkDone.matches("yes")){
                    System.out.println("Please type s or m or l");
                    System.out.println("which drink size would you like: small $1.00, medium $1.50, large $2.00)");
                    String realDrink=ui.next();
                    if (realDrink.equalsIgnoreCase("s")){
                        cost+=1.00;
                        drinkDone="yes";
                        System.out.print(cost);
                        break;
                                                    
                    }
                    if (realDrink.equalsIgnoreCase("m")){
                        cost+=1.50;
                        drinkDone="yes";
                        System.out.print(cost);
                        break;
                    }
                    if (realDrink.equalsIgnoreCase("l")){
                        while (!childSize.equals ("yes")){
                            System.out.println("Do you want upgrade to child size for $0.38 (y/n)");
                            String realChildSize=ui.next();
                            if (realChildSize.equalsIgnoreCase("y")){
                                cost+=2.38;
                                drinkDone="yes";
                                childSize="yes";
                                System.out.print(cost);
                                break; 
                            }
                            else if(realChildSize.equalsIgnoreCase("n")){
                            cost+=2.00;
                            drinkDone="yes";
                            childSize="yes";
                            System.out.print(cost);
                            break;
                            }
                        }
                    }
                                            }}}
        System.out.println("do you want ketchup? (y/n)");
        String wantKetchup=ui.next();
        if (wantKetchup.equalsIgnoreCase("n")){ 
            
    }
        else if (wantKetchup.equalsIgnoreCase("y")){
            while (!ketchupDone.equals ("yes")){
                System.out.println("how many? ($0.25 each)");
                Double ketchup=(double)ui.nextDouble();
                ketchup=(double)ketchup*0.25;
                cost=cost+ketchup;
                ketchupDone="yes";


        }}
        System.out.println("are you done? (y/n)");
        String actullDone=ui.next();
        if (actullDone.equalsIgnoreCase("n")){ 
            reallyDone="no";
            sandwichDone="no";
            friesDone="no";
            drinkDone="no";
        }
        else if (actullDone.equalsIgnoreCase("y")){
            if (sandwichDiscount.equals("yes") && friesDiscount.equals("yes") && drinkDiscount.equals("yes")  ){
                cost=cost-1;
                System.out.println("pretax cost: "+cost);
                Double tax=cost*0.07;
                tax=tax+cost;
                System.out.println(tax);
                tax=(double)Math.round(tax*100)/100;
                System.out.println(tax);
                System.out.println("after tax: "+tax);
                reallyDone="yes";
            }
            else{
                System.out.println("pretax cost: "+cost);
                Double tax=cost*0.07;
                tax=tax+cost;
                System.out.println(tax);
                tax=(double)Math.round(tax*100)/100;
                System.out.println(tax);
                System.out.println("after tax: "+tax);
                reallyDone="yes";
            }
        }
        }
    }
}