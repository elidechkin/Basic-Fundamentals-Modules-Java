package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (drink){
            case "coffee":
                printPriceCoffee(quantity, price);
                break;
            case "water":
                printPriceWater(quantity, price);
                break;
            case "coke":
                printPriceCoke(quantity, price);
                break;
            case "snacks":
                printPriceSnacks(quantity, price);
                break;
        }
    }
    public static void printPriceCoffee(int quantity, double price){
        price = 1.50;
        double totalPrice = quantity * price;
        System.out.printf("%.2f", totalPrice);
    }
    public static void printPriceWater(int quantity, double price){
        price = 1.00;
        double totalPrice = quantity * price;
        System.out.printf("%.2f", totalPrice);
    }
    public static void printPriceCoke(int quantity, double price){
        price = 1.40;
        double totalPrice = quantity * price;
        System.out.printf("%.2f", totalPrice);
    }
    public static void printPriceSnacks(int quantity, double price){
        price = 2.00;
        double totalPrice = quantity * price;
        System.out.printf("%.2f", totalPrice);
    }
}
