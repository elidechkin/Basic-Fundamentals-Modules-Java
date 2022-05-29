package MoreExe;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double china = Double.parseDouble(scanner.nextLine());
        double commision = Double.parseDouble(scanner.nextLine());


         double bitcoinLv = bitcoins * 1168;
         double chinaLv = (china * 0.15) * 1.76;
         double euro = (bitcoinLv + chinaLv) / 1.95;
         double sumWithoutComm = euro - (euro * commision / 100);

        System.out.printf("%.2f", sumWithoutComm);

    }
}
