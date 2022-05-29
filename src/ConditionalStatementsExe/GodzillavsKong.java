package ConditionalStatementsExe;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int stat = Integer.parseInt(scanner.nextLine());
        double priceCloth = Double.parseDouble(scanner.nextLine());

        double decorprice = budget * 0.10;
        double totalCloth = stat * priceCloth;

        if (stat > 150) {
            totalCloth = totalCloth - (totalCloth * 0.10);

        }
        double totalPrice = decorprice + totalCloth;

        if ( totalPrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(totalPrice - budget));
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(totalPrice - budget));


        }
    }
}
