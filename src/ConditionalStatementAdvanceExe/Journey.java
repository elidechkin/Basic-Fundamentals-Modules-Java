package ConditionalStatementAdvanceExe;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        double price = 0;
        String type = "";

        if (budget <= 100){
            destination = "Bulgaria";
            switch (season){
                case "summer":
                    type = "Camp";
                    price = budget * 0.30;
                    break;
                case "winter":
                    type = "Hotel";
                    price = budget * 0.70;
                    break;
            }

        }else if (budget <= 1000){
            destination = "Balkans";
            switch (season){
                case "summer":
                    type = "Camp";
                    price = budget * 0.40;
                    break;
                case "winter":
                    type = "Hotel";
                    price = budget * 0.80;
                    break;
            }

        }else if (budget > 1000){
            destination = "Europe";
            type = "Hotel";
            price = budget * 0.90;

        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", type, price);



    }
}
