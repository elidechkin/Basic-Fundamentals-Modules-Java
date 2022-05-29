package DataTypeVariables;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int numOfLines = Integer.parseInt(scanner.nextLine());



        for (int i = 0; i < numOfLines; i++) {
            char letter = scanner.nextLine().charAt(0);
            int word = key + letter;
            char secretWord = (char)word;

            System.out.printf("%c", secretWord);




        }

    }
}
