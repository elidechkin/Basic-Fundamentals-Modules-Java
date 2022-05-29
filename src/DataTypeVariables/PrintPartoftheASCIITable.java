package DataTypeVariables;

import java.util.Scanner;

public class PrintPartoftheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSymbol = Integer.parseInt(scanner.nextLine());
        int lastSymbol = Integer.parseInt(scanner.nextLine());

        for (int i = firstSymbol; i <= lastSymbol; i++) {
            char code = (char) i;
            System.out.print(code + " ");

        }
    }
}
