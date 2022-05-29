package MoreExe;

import java.io.PrintStream;
import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int junior = Integer.parseInt(scanner.nextLine());
        int senior = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        double price = 0;

        switch (trace){
            case "trail":
               price = junior * 5.50 + senior * 7;
                break;
            case "cross-country":
                price = junior * 8 +senior * 9.50;
                if ( (junior + senior) >= 50){
                    price = price - (price * 0.25);
                }
                break;
            case "downhill":
                price = junior * 12.25 + senior * 13.75;
                break;
            case "road":
                price = junior * 20.00 + senior * 21.50 ;
                break;
        }

        System.out.printf("%.2f", price - ( price * 0.05));

    }
}
