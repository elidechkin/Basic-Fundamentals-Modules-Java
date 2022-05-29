package MoreExe;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workMen = Integer.parseInt(scanner.nextLine());

        double land = x * 0.40;
        double amountOfGrapes = land * y;
        double vine = amountOfGrapes / 2.5;


        if (vine < z){
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(z - vine ));

        }else if (vine >= z){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", vine);
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.floor(vine - z),(vine - z) / workMen );

        }
    }
}
