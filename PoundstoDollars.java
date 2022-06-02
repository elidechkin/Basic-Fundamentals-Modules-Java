package BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class PoundstoDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int pounds = Integer.parseInt(scanner.nextLine());
//        double dollars = pounds * 1.36;
//
//        System.out.printf("%.3f", dollars);
        float pound = Float.parseFloat(scanner.nextLine());

        float dollars = pound * 1.36f;

        System.out.printf("%.3f", dollars);
    }
}
