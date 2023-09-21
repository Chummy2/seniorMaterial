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
    String ketchupDone2="no";
    String finalKeptchup="no";
    String sandwichDiscount="no";
    String friesDiscount="no";
    String drinkDiscount="no";
    double cost=0.0;
    int orderNumber = 1;
    String allOrders = "";
    String finalSandwich="";
    String finalFry="";
    String finalDrink="";
    String finalChildSize="";
    Scanner ui = new Scanner(System.in);
    String reallyDone="";
    while (!reallyDone.equals ("yes")){
        System.out.println("Order " + orderNumber + ":");
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
                        finalSandwich = "chicken sandwich";
                        break;
                        
                    }
                    if (realSandwich.equalsIgnoreCase("b")){
                        cost+=6.25;
                        sandwichDone="yes";
                        finalSandwich = "beef sandwich";
                        break;
                    }
                    if (realSandwich.equalsIgnoreCase("t")){
                        cost+=5.75;
                        sandwichDone="yes";
                        finalSandwich = "tofu sandwich";
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
                            finalFry = "small fry";
                            break;
                                
                        }
                        if (realFries.equalsIgnoreCase("m")){
                            cost+=1.75;
                            friesDone="yes";
                            finalFry = "medium fry";
                            break;
                        }
                        if (realFries.equalsIgnoreCase("l")){
                            cost+=2.25;
                            friesDone="yes";
                            finalFry = "large fry";
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
                        finalDrink = "small drink";
                        break;
                                                    
                    }
                    if (realDrink.equalsIgnoreCase("m")){
                        cost+=1.50;
                        drinkDone="yes";
                        finalDrink = "medium drink";
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
                                finalChildSize = "child size drink";
                                break; 
                            }
                            else if(realChildSize.equalsIgnoreCase("n")){
                            cost+=2.00;
                            drinkDone="yes";
                            finalDrink = "large drink";
                            break;
                            }
                        }
                    }
                                            }}}
        String wantKetchup2="";                          
        while (!ketchupDone2.equals ("yes")){
            System.out.println("Do you want ketchup? (y/n)");
            String wantKetchup = ui.next();
            if (wantKetchup.equalsIgnoreCase("n")) {
                wantKetchup2 = "n";
                ketchupDone2 = "yes";
            } else if (wantKetchup.equalsIgnoreCase("y")) {
                while (!ketchupDone.equals("yes")) {
                    System.out.println("How many? ($0.25 each)");
                    try {
                        int numKetchup = Integer.parseInt(ui.next());
                        if (numKetchup > 0) {
                            double ketchupCost = numKetchup * 0.25;
                            cost += ketchupCost;
                            ketchupDone = "yes";
                            ketchupDone2 = "yes";
                            wantKetchup2 = "y";
                        } else {
                            System.out.println("Input a number higher than 0.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
        }}}}
        System.out.println("are you done? (y/n)");
        String actullDone=ui.next();
        if (actullDone.equalsIgnoreCase("n")){
            String summary = "Order " + orderNumber + " Summary:\n";
            if (!finalSandwich.isEmpty()) {
                summary += "Sandwich: " + finalSandwich + "\n";
            }
            if (!finalFry.isEmpty()) {
                summary += "Fries: " + finalFry + "\n";
            }
            if (!finalDrink.isEmpty()) {
                summary += "Drink: " + finalDrink + "\n";
            }
            if (!finalChildSize.isEmpty()) {
                summary += "Child Size Drink: " + finalChildSize + "\n";
            }
            if (wantKetchup2.equalsIgnoreCase("y")) {
                summary += "Ketchup: Yes\n";
            }

            if (sandwichDiscount.equals("yes") && friesDiscount.equals("yes") && drinkDiscount.equals("yes")) {
                cost -= 1;
                System.out.println("Discount activated");
            }
            String finalCost = String.format("%.2f", cost);
            summary += "Pretax cost: $" + finalCost + "\n";
            double tax = cost * 0.07;
            cost += tax;
            finalCost = String.format("%.2f", cost);
            summary += "After tax: $" + cost + "\n";

            allOrders += summary; 
            orderNumber++;
            //Resets it all for next order
            reallyDone="no";
            sandwichDone="no";
            friesDone="no";
            drinkDone="no";
            ketchupDone="no";
            ketchupDone2="no";
            childSize="no";
            finalChildSize = "";
            }
        else if (actullDone.equalsIgnoreCase("y")){
            String summary = "Order " + orderNumber + " Summary:\n";
            if (!finalSandwich.isEmpty()) {
                summary += "\t"+"Sandwich: " + finalSandwich + "\n";
            }
            if (!finalFry.isEmpty()) {
                summary += "\t"+"Fries: " + finalFry + "\n";
            }
            if (!finalDrink.isEmpty()) {
                summary += "\t"+"Drink: " + finalDrink+ "\n";
            }
            if (!finalChildSize.isEmpty()) {
                summary += "\t"+"Child Size Drink: " + finalChildSize + "\n";
            }
            if (wantKetchup2.equalsIgnoreCase("y")) {
                summary += "\t"+"Ketchup: Yes\n";
            }

            if (sandwichDiscount.equals("yes") && friesDiscount.equals("yes") && drinkDiscount.equals("yes")) {
                cost -= 1;
                System.out.println("dollar discount activated");
            }

            summary += "Pretax cost: $" + cost + "\n";
            double tax = cost * 0.07;
            cost += tax;
            cost = Math.round(cost * 100) / 100.0;
            summary += "After tax: $" + cost + "\n";
            allOrders += summary;
            reallyDone="yes";
        }

        }
        System.out.println("All Orders:");
        System.out.println(allOrders);
    }
}