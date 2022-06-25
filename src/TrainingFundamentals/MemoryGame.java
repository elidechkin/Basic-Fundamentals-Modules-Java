package TrainingFundamentals;

import java.util.Scanner;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] tokens = input.split("\\|");
            String action = tokens[0];

            switch (action) {
                case "Move": {
                    int numLetters = Integer.parseInt(tokens[1]);

                    String firstPart = message.substring(0, numLetters);
                    String secondPart = message.substring(numLetters);
                    message = secondPart.concat(firstPart);
                    break;
                }
                case "Insert": {
                    int index = Integer.parseInt(tokens[1]);
                    String element = tokens[2];

                    String firstPart = message.substring(0, index);
                    String secondPart = message.substring(index);
                    message = firstPart.concat(element).concat(secondPart);
                    break;
                }
                case "ChangeAll": {
                    String substring = tokens[1];
                    String replacement = tokens[2];
                    message = message.replace(substring, replacement);
                    break;
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s%n", message);
    }
}
