package ConditionalStatementAdvanceExe;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String rating = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;


        switch (typeRoom){
            case "room for one person":
                price = 18;
                totalPrice = price * (days - 1);
                break;

            case "apartment":
                price = 25;
                if (days < 10){
                    totalPrice = (price * (days - 1)) - (price * (days - 1) * 0.30);
                }else if (days > 10 && days <= 15){
                    totalPrice = (price * (days - 1)) - (price * (days - 1) * 0.35);
                }else if (days > 15){
                    totalPrice = (price * (days - 1)) - (price * (days - 1) * 0.50);
                }
                break;

            case "president apartment":
                price = 35;
                if (days < 10){
                    totalPrice = (price * (days - 1)) - (price * (days - 1) * 0.10);
                }else if (days > 10 && days <= 15){
                    totalPrice = (price * (days - 1)) - (price * (days - 1) * 0.15);
                }else if (days > 15){
                    totalPrice = (price * (days - 1)) - (price * (days - 1) * 0.20);
                }

                break;
        }
        if (rating.equals("positive")){
            totalPrice = totalPrice + totalPrice * 0.25;
        }else if(rating.equals("negative")){
            totalPrice = totalPrice - totalPrice * 0.10;
        }
        System.out.printf("%.2f", totalPrice);

    }
}
