package MoreExe;

import java.util.Scanner;

public class Past {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyInherited = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());

        double moneySpend = 0;
        int currentAge = 18;

        for (int i = 1800; i <= yearToLive ; i++) {
            if (i % 2==0) {
                moneySpend += 12000;
                currentAge++;
            } else if (i % 2 !=0) {
                moneySpend += 12000 +50 * currentAge++;
            }

        }
        if (moneySpend <= moneyInherited) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyInherited - moneySpend);
        } else if (moneySpend > moneyInherited) {
            System.out.printf("He will need %.2f dollars to survive.", moneySpend - moneyInherited);
        }

    }
}
