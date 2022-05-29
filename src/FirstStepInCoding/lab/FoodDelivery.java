package FirstStepInCoding.lab;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chikenM = Integer.parseInt(scanner.nextLine());
        int fishM = Integer.parseInt(scanner.nextLine());
        int vegM = Integer.parseInt(scanner.nextLine());


        double priceChik =  chikenM * 10.35;
        double priceFish = fishM * 12.40;
        double priceVeg = vegM * 8.15;
        double priceMenu = priceChik + priceFish + priceVeg;
        double desert = priceMenu * 20 / 100.00;
        double totalOrder = priceMenu + desert + 2.50;

        System.out.println(totalOrder);


    }
}
