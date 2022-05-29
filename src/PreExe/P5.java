package PreExe;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int purpose = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        double price = 0;

        while (!input.equals("closed")) {

            if(input.equals("haircut")) {
                input = scanner.nextLine();
                    if (input.equals("men")) {
                        price += 15;
                    } else if (input.equals("ladies")) {
                        price += 20;
                    } else if (input.equals("kids")) {
                        price += 10;
                    }

            }else if (input.equals("color"))
                input = scanner.nextLine();

                if  (input.equals("touch up")) {
                    price += 20;
                } else if (input.equals("full color")) {
                    price += 30;
                }

            if (price >= purpose){
                break;
            }

            input = scanner.nextLine();

            }

            if (price >= purpose) {
                System.out.println("You have reached your target for the day!");
                System.out.printf("Earned money: %.0flv.", price);
            } else {
                System.out.printf("Target not reached! You need %.0flv. more.%n", purpose - price);
                System.out.printf("Earned money: %.0flv.", price);
            }


    }
}