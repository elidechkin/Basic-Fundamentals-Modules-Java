package FirstStepInCoding.lab;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penc = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int vero = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)

        double pricePenc = penc * 5.80;
        double priceMarkers =  markers * 7.20;
        double priceVero = vero * 1.20;
        double totalPrice = pricePenc + priceMarkers + priceVero;

        double totalPriceDiscount = totalPrice - (totalPrice * percent / 100);

        System.out.println(totalPriceDiscount);
    }
}
