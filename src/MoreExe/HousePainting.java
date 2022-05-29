package MoreExe;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double walls = ((2 * (x * x)) - (1.2 * 2)) + ((2 * (x  * y)) - 2 * (1.5 * 1.5));
        double greenPaint = walls / 3.4;

        double roof = (2 * (x * y)) + (2 * (x * h / 2));
        double redpaint = roof / 4.3;

        System.out.printf("%.2f", greenPaint);
        System.out.println();
        System.out.printf("%.2f", redpaint);


    }
}
