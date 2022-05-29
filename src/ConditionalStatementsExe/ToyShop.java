package ConditionalStatementsExe;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         double priceTour = Double.parseDouble(scanner.nextLine());
         int puzzles = Integer.parseInt(scanner.nextLine());
         int dolls = Integer.parseInt(scanner.nextLine());
         int bears = Integer.parseInt(scanner.nextLine());
         int minion = Integer.parseInt(scanner.nextLine());
         int trucks = Integer.parseInt(scanner.nextLine());


        double order = puzzles * 2.60 + dolls * 3.00 + bears * 4.10 + minion * 8.20 + trucks * 2.00;
        int countToys = puzzles + dolls + bears + minion + trucks;

        if (countToys >= 50){
            order = order - (order * 0.25);
        }
        order = order - (order * 0.10);

        if (order >= priceTour) {
            System.out.printf("Yes! %.2f lv left.", order - priceTour);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(order - priceTour));
        }
    }
}
