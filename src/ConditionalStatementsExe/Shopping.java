package ConditionalStatementsExe;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());


        double priceVideoCard = videoCard * 250.00;
        double priceCpu = (priceVideoCard * 0.35) * cpu;
        double priceRam = (priceVideoCard * 0.10) * ram;

        double totalPrice = priceVideoCard + priceCpu + priceRam;

        if (videoCard > cpu){
            totalPrice = totalPrice - (totalPrice * 0.15);
        }
        //•	Ако бюджета е достатъчен:
        //"You have {остатъчен бюджет} leva left!"
        //•	Ако сумата надхвърля бюджета:
        //"Not enough money! You need {нужна сума} leva more!"

        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else{
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }




    }
}
