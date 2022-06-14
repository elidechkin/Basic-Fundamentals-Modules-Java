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
                case "Move": { // <- На всички кейсове съм добавил къдрави отварящи и затварящи скоби,
                    // защото използвам еднакви имена на променливи в два от тях.
                    int numLetters = Integer.parseInt(tokens[1]);

                    //Проверка за празен стринг
                    //if (message.length() > 0 && numLetters < message.length()) { Всъщност, нямаш нужда от тези операции.
                    //   StringBuilder strBuild = new StringBuilder(message);
                    //    for (int i = 0; i < numLetters; i++) {
                    //      strBuild.append(strBuild.charAt(0));
                    //        strBuild.deleteCharAt(0);
                    //    }
                    //    message = strBuild.toString();
                    // }
                    // Може да го направиш направо така и доста си улесняваш живота :)
                    String firstPart = message.substring(0, numLetters);
                    String secondPart = message.substring(numLetters);
                    message = secondPart.concat(firstPart);
                    break;
                }
                case "Insert": {
                    int index = Integer.parseInt(tokens[1]);
                    String element = tokens[2];
                    //Проверка за елемент
                    // if (index >= 0 && index <= message.length()) {
                    //    StringBuilder stringBuilder = new StringBuilder(message);
                    //    stringBuilder.insert(index, element);
                    //    message = stringBuilder.toString();
                    //}

                    // И тук по подобен начин на горния кейс:
                    String firstPart = message.substring(0, index);
                    String secondPart = message.substring(index);
                    message = firstPart.concat(element).concat(secondPart);
                    break;
                }
                case "ChangeAll": {
                    String substring = tokens[1];
                    String replacement = tokens[2];
                    //if (message.contains(substring))
                    // { Тази проверка не ти е нужна и можеш да използваш просто replace вместо replaceAll.
                    //}
                    message = message.replace(substring, replacement);
                    break;
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s%n", message);
    }
}
