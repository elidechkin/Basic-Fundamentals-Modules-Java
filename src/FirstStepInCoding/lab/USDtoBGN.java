package FirstStepInCoding.lab;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Usd = Double.parseDouble(scanner.nextLine());
        double bgn = Usd * 1.79549;

        System.out.printf("%.2f",bgn);


    }
}
