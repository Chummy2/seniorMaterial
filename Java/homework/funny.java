import java.util.Scanner;

public class ComboMenuRev4 {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        boolean done = false;
        int orderNumber = 1;
        String allOrders = "";

        while (!done) {
            String sandwichDone = "no";
            String friesDone = "no";
            String drinkDone = "no";
            String sandwich = "";
            String fries = "";
            String drink = "";
            String childSize = "";
            String ketchupDone = "no";
            String sandwichDiscount = "no";
            String friesDiscount = "no";
            String drinkDiscount = "no";
            double cost = 0.0;
            System.out.println("Order " + orderNumber + ":");

            while (!sandwichDone.equals("yes")) {
                System.out.println("Do you want a sandwich? (y/n)");
                String wantSandwich = ui.next();
                if (wantSandwich.equalsIgnoreCase("n")) {
                    break;
                } else if (wantSandwich.equalsIgnoreCase("y")) {
                    sandwichDiscount = "yes";
                    while (!sandwich.matches("cbt")) {
                        System.out.println("Please type c or b or t");
                        System.out.println("Which sandwich would you like: chicken $5.25, beef $6.25, tofu $5.75)");
                        String realSandwich = ui.next();
                        if (realSandwich.equalsIgnoreCase("c")) {
                            cost += 5.25;
                            sandwichDone = "yes";
                            sandwich = "chicken sandwich";
                            break;
                        }
                        if (realSandwich.equalsIgnoreCase("b")) {
                            cost += 6.25;
                            sandwichDone = "yes";
                            sandwich = "beef sandwich";
                            break;
                        }
                        if (realSandwich.equalsIgnoreCase("t")) {
                            cost += 5.75;
                            sandwichDone = "yes";
                            sandwich = "tofu sandwich";
                            break;
                        }
                    }
                }
            }

            while (!friesDone.equals("yes")) {
                System.out.println("Do you want fries? (y/n)");
                String wantFries = ui.next();
                if (wantFries.equalsIgnoreCase("n")) {
                    break;
                } else if (wantFries.equalsIgnoreCase("y")) {
                    friesDiscount = "yes";
                    while (!fries.matches("cbt")) {
                        System.out.println("Please type s or m or l");
                        System.out.println("Which fry size would you like: small $1.00, medium $1.50, large $2.00)");
                        String realFries = ui.next();
                        if (realFries.equalsIgnoreCase("s")) {
                            cost += 1.00;
                            friesDone = "yes";
                            fries = "small fries";
                            break;
                        }
                        if (realFries.equalsIgnoreCase("m")) {
                            cost += 1.75;
                            friesDone = "yes";
                            fries = "medium fries";
                            break;
                        }
                        if (realFries.equalsIgnoreCase("l")) {
                            cost += 2.25;
                            friesDone = "yes";
                            fries = "large fries";
                            break;
                        }
                    }
                }
            }

            while (!drinkDone.equals("yes")) {
                System.out.println("Do you want a drink? (y/n)");
                String wantDrink = ui.next();
                if (wantDrink.equalsIgnoreCase("n")) {
                    break;
                } else if (wantDrink.equalsIgnoreCase("y")) {
                    drinkDiscount = "yes";
                    while (!drinkDone.matches("yes")) {
                        System.out.println("Please type s or m or l");
                        System.out.println("Which drink size would you like: small $1.00, medium $1.50, large $2.00)");
                        String realDrink = ui.next();
                        if (realDrink.equalsIgnoreCase("s")) {
                            cost += 1.00;
                            drinkDone = "yes";
                            drink = "small drink";
                            break;
                        }
                        if (realDrink.equalsIgnoreCase("m")) {
                            cost += 1.50;
                            drinkDone = "yes";
                            drink = "medium drink";
                            break;
                        }
                        if (realDrink.equalsIgnoreCase("l")) {
                            while (!childSize.equals("yes")) {
                                System.out.println("Do you want to upgrade to child size for $0.38 (y/n)");
                                String realChildSize = ui.next();
                                if (realChildSize.equalsIgnoreCase("y")) {
                                    cost += 2.38;
                                    drinkDone = "yes";
                                    childSize = "yes";
                                    drink = "child-size drink";
                                    break;
                                } else if (realChildSize.equalsIgnoreCase("n")) {
                                    cost += 2.00;
                                    drinkDone = "yes";
                                    childSize = "yes";
                                    drink = "large drink";
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            System.out.println("Do you want ketchup? (y/n)");
            String wantKetchup = ui.next();
            if (wantKetchup.equalsIgnoreCase("y")) {
                while (!ketchupDone.equals("yes")) {
                    System.out.println("How many? ($0.25 each)");
                    double ketchup = ui.nextDouble();
                    ketchup *= 0.25;
                    cost += ketchup;
                    ketchupDone = "yes";
                }
            }

            System.out.println("Is this order complete? (y/n)");
            String actualDone = ui.next();
            if (actualDone.equalsIgnoreCase("y")) {
                String orderSummary = "Order " + orderNumber + " Summary:\n";
                if (!sandwich.isEmpty()) {
                    orderSummary += "Sandwich: " + sandwich + "\n";
                }
                if (!fries.isEmpty()) {
                    orderSummary += "Fries: " + fries + "\n";
                }
                if (!drink.isEmpty()) {
                    orderSummary += "Drink: " + drink + "\n";
                }
                if (!childSize.isEmpty()) {
                    orderSummary += "Child Size Drink: " + childSize + "\n";
                }
                if (wantKetchup.equalsIgnoreCase("y")) {
                    orderSummary += "Ketchup: Yes\n";
                }

                if (sandwichDiscount.equals("yes") && friesDiscount.equals("yes") && drinkDiscount.equals("yes")) {
                    cost -= 1;
                }

                orderSummary += "Pretax cost: $" + cost + "\n";
                double tax = cost * 0.07;
                cost += tax;
                cost = Math.round(cost * 100) / 100.0;
                orderSummary += "After tax: $" + cost + "\n";

                allOrders += orderSummary;

                System.out.println("Do you want to place another order? (y/n)");
                String placeAnotherOrder = ui.next();
                if (placeAnotherOrder.equalsIgnoreCase("n")) {
                    done = true;
                } else {
                    orderNumber++;
                }
            }
        }

        // Print all orders
        System.out.println("All Orders:");
        System.out.println(allOrders);
    }
}
