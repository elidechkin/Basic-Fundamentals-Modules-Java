package ForLoopExe;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double lav = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        double moneyBD = 0;
        double brother = 0;
        int toys = 0;


        for (int i = 1; i <= age ; i++) {
            if (i % 2 == 0) {
                if (i == 2) {
                    moneyBD = 10;
                } else {
                    moneyBD += 10.00 * i / 2;
                }
                brother++;


            } else {
                toys++;
            }
        }
        double totalMoney = moneyBD - brother + (toys * priceToy);

        if ( lav <= totalMoney){
            System.out.printf("Yes! %.2f", totalMoney -lav);
        }else {
            System.out.printf("No! %.2f", lav - totalMoney);
        }



    }
}


