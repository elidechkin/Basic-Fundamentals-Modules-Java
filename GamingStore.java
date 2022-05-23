package BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double boughtGames  = 0;
        double priceGame = 0;
        double finalBalance = currentBalance;


        while (!input.equals("Game Time")){

            switch (input){
                case "OutFall 4":
                    priceGame = 39.99;
                    boughtGames += priceGame;
                    if (priceGame > currentBalance){
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.printf("Bought %s%n", input);
                        currentBalance -= priceGame;
                        break;
                    }
                case "CS: OG":
                    priceGame = 15.99;
                    boughtGames += priceGame;
                     if (priceGame > currentBalance){
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.printf("Bought %s%n", input);
                        currentBalance -= priceGame;
                        break;
                    }
                case "Zplinter Zell":
                    priceGame = 19.99;
                    boughtGames += priceGame;

                     if (priceGame > currentBalance){
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.printf("Bought %s%n", input);
                        currentBalance -= priceGame;
                        break;                    }
                case "Honored 2":
                    priceGame = 59.99;
                    boughtGames += priceGame;

                    if (boughtGames > currentBalance){
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.printf("Bought %s%n", input);
                        currentBalance -= priceGame;
                        break;
                    }
                case "RoverWatch":
                    priceGame = 29.99;
                    boughtGames += priceGame;

                     if (priceGame > currentBalance){
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.printf("Bought %s%n", input);
                        currentBalance -= priceGame;
                        break;
                    }
                case "RoverWatch Origins Edition":
                    priceGame = 39.99;
                    boughtGames += priceGame;

                     if (priceGame > currentBalance){
                        System.out.println("Too Expensive");
                        break;
                    } else {
                        System.out.printf("Bought %s%n", input);
                        currentBalance -= priceGame;
                        break;
                    }
                default:
                    System.out.println("Not Found");
            }

            input = scanner.nextLine();

        }
        if (currentBalance == 0){
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",boughtGames, finalBalance- boughtGames);
        }

    }
}






