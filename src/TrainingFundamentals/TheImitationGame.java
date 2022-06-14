package TrainingFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Decode")){
            String[] commands = input.split("\\|");
            String action = commands[0];

            switch (action){
                case "Move":
                    int index = Integer.parseInt(commands[1]);

                    String firstPart = message.substring(0, index);
                    String secondPart = message.substring(index);
                    message = secondPart.concat(firstPart);
                    break;
                case "Insert":
                    //o	Inserts the given value before the given index in the string
                    int index1 = Integer.parseInt(commands[1]);
                    String element = commands[2];

                    String first = message.substring(0, index1);
                    String second = message.substring(index1);
                    message = first.concat(element).concat(second);
                    break;
                case "ChangeAll":
                    String substring = commands[1];
                    String replacement = commands[2];
                    message = message.replace(substring, replacement);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s%n", message);
    }
}

