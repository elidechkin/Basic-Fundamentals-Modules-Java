package MoreExe;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double priceSport = 0;

        switch (gender){
            case "m":
                switch (sport){
                    case "Gym":
                        priceSport += 42;
                        break;
                    case "Boxing":
                        priceSport += 41;
                        break;
                    case "Yoga":
                        priceSport += 45;
                        break;
                    case "Zumba":
                        priceSport += 34;
                        break;
                    case "Dances":
                        priceSport += 51;
                        break;
                    case "Pilates":
                        priceSport += 39;
                        break;
                }
                break;
            case "f":
                switch (sport){
                    case "Gym":
                        priceSport += 35;
                        break;
                    case "Boxing":
                        priceSport += 37;
                        break;
                    case "Yoga":
                        priceSport += 42;
                        break;
                    case "Zumba":
                        priceSport += 31;
                        break;
                    case "Dances":
                        priceSport += 53;
                        break;
                    case "Pilates":
                        priceSport += 37;
                        break;
                }
                break;

        }
        if (age <= 19){
            priceSport = priceSport - (priceSport * 0.20);
        }
        if (priceSport <= sum){
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }else {
            System.out.printf("You don't have enough money! You need $%.2f more.", priceSport - sum);
        }

    }
}
