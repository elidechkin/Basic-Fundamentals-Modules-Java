package ExamTrainningFundamental;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String input = scanner.nextLine();
        String substring = "";
        int startIndex = 0;
        int endIndex = 0;

        while (!input.equals("Generate")){
            String[] tokens= input.split(">>>");
            String command = tokens[0];

            if (command.equals("Contains")){
                substring = tokens[1];
                if (activationKey.contains(substring)){
                    System.out.printf("%s contains %s%n", activationKey, substring);
                }else {
                    System.out.println("Substring not found!");
                }
            }else if (command.equals("Flip")){
                //Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
                String upperOrLower = tokens[1];
                startIndex = Integer.parseInt(tokens[2]);
                endIndex = Integer.parseInt(tokens[3]);
                substring = activationKey.substring(startIndex, endIndex);
                if (upperOrLower.equals("Upper")){
                    activationKey = activationKey.replace(substring, substring.toUpperCase());
                }else {
                    activationKey = activationKey.replace(substring, substring.toLowerCase());
                }
                System.out.println(activationKey);
            }else if (command.equals("Slice")){
                startIndex = Integer.parseInt(tokens[1]);
                endIndex = Integer.parseInt(tokens[2]);
                substring = activationKey.substring(startIndex, endIndex);
                activationKey = activationKey.replace(substring, "");
                System.out.println(activationKey);
            }

            input= scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", activationKey);
    }
}
