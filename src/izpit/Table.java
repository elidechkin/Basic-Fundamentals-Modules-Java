package izpit;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int first = number % 10;
        int second = number / 10 %10;
        int tirthy = number / 100;

        for (int a = 1; a <= first; a++) {
            for (int b = 1; b <=second ; b++) {
                for (int c = 1; c <=tirthy ; c++) {
                    System.out.printf("%d * %d * %d = %d%n", a, b, c, a*b*c);

                }

            }

        }
    }
}
