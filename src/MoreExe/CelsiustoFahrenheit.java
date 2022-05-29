package MoreExe;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double c = Double.parseDouble(scanner.nextLine());

        double f = (c * 9 / 5) + 32;

        System.out.printf("%.2f", f);
    }
}
