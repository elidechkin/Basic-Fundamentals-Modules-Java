package MoreExe;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceKgSkum = Double.parseDouble(scanner.nextLine());
        double priceKgCaca = Double.parseDouble(scanner.nextLine());
        double kgPal = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        double kgMidi = Double.parseDouble(scanner.nextLine());


        double pricePalamud = priceKgSkum + (priceKgSkum * 60 / 100);
        double totalPalamud = pricePalamud * kgPal;
        double priceSafrid = priceKgCaca + (priceKgCaca * 80 / 100);
        double totalSafrid = priceSafrid * kgSafrid;
        double totalMidi = kgMidi * 7.50;
        double totalPrice = totalPalamud + totalSafrid + totalMidi;

        System.out.printf("%.2f", totalPrice);


    }
}
