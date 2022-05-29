package DataTypeVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int source = Integer.parseInt(scanner.nextLine());


        int days = 0;
        int totalAmountSpice = 0;

        while (source >= 100){
            int spice = source - 26;
            totalAmountSpice += spice;
            days++;
            source -= 10;

        }
        System.out.println(days);
        if (totalAmountSpice >=26){
            totalAmountSpice -= 26;
        }
        System.out.println(totalAmountSpice);

    }
}
