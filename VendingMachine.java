package BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;
        double price =0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.10 || coins == 0.20 || coins == 0.50 || coins == 1.00 || coins == 2.00) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

            while (!input.equals("End")){


                if (input.equals("Nuts")){
                    price= 2.00;
                    if (sum >= 2.00){
                        sum-= price;
                        System.out.printf("Purchased %s%n", input);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }

                }else if (input.equals("Water")){
                    price= 0.70;
                    if (sum >= 0.70){
                        sum-= price;
                        System.out.printf("Purchased %s%n", input);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }

                }else if (input.equals("Crisps")){
                    price= 1.50;
                    if (sum >= 1.50){
                        sum-= price;
                        System.out.printf("Purchased %s%n", input);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }

                }else if (input.equals("Soda")){
                    price= 0.80;
                    if (sum >= 0.80){
                        sum-= price;
                        System.out.printf("Purchased %s%n", input);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }

                }else if (input.equals("Coke")){
                    price= 1.00;
                    if (sum >= 1.00){
                        sum-= price;
                        System.out.printf("Purchased %s%n", input);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }

                } else{
                    System.out.println("Invalid product");
                }

                input = scanner.nextLine();
            }

            System.out.printf("Change: %.2f", sum);

    }
}
