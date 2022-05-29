package MoreExe;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVeg = Double.parseDouble(scanner.nextLine());
        double priceFruit = Double.parseDouble(scanner.nextLine());
        int totalKgVeg = Integer.parseInt(scanner.nextLine());
        int totalKgFruit =Integer.parseInt(scanner.nextLine());

        double veg = priceVeg * totalKgVeg;
        double fruit = totalKgFruit * priceFruit;
        double totalSumEuro = (veg + fruit) / 1.94;

        System.out.printf("%.2f", totalSumEuro);

    }
}
