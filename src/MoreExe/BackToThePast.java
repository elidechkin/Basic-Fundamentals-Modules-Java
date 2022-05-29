package MoreExe;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());


        double rest = 0;
        int age = 18;


        for (int i = 1800; i <= years; i++) {
            if (i % 2 == 0) {
                rest += 12000;
                age ++;

            }else if (i % 2 != 0){
                rest += 12000 + 50 * age++;
            }

        }
        if (rest <= money) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money - rest);
        } else if (rest > money){
            System.out.printf("He will need %.2f dollars to survive.",rest - money);
        }
    }
}

