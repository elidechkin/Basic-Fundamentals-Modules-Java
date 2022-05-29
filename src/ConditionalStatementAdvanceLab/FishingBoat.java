package ConditionalStatementAdvanceLab;


import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String  season = scanner.nextLine();
        int fishman  = Integer.parseInt(scanner.nextLine());

        double price = 0;


        switch (season){
            case "Spring":
                price = 3000;
                if (fishman <=  6 ){
                    price = price - price * 0.10;
                }else if (fishman > 7 && fishman <= 11){
                    price = price - price * 0.15;
                }else if (fishman >= 12){
                    price = price - price * 0.25;
                }
                if (fishman % 2 == 0) {
                    price = price - price * 0.05;
                }
                break;
            case "Summer":
                price = 4200;
                if (fishman <=  6){
                    price = price - price * 0.10;
                }else if (fishman > 7 && fishman <= 11){
                    price = price - price * 0.15;
                }else if (fishman >= 12){
                    price = price - price * 0.25;
                }
                if (fishman % 2 == 0){
                    price = price - price * 0.05;
                }
                break;
            case "Autumn":
                price = 4200;
                if (fishman <=  6){
                    price = price - price * 0.10;
                }else if (fishman > 7 && fishman <= 11){
                    price = price - price * 0.15;
                }else if (fishman >= 12){
                    price = price - price * 0.25;
                }
                break;
            case "Winter":
                price = 2600;
                if (fishman <=  6){
                    price = price - price * 0.10;
                }else if (fishman > 7 && fishman <= 11){
                    price = price - price * 0.15;
                }else if (fishman >= 12){
                    price = price - price * 0.25;
                }
                if (fishman % 2 == 0){
                    price = price - price * 0.05;
                }
                break;

        }

        if (budget >= price){
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}
