package TextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] codes = scanner.nextLine().split("\\s+");

        double totalSum = 0;
        for (String code : codes) {
            char firstLetter = code.charAt(0);
            char lastLetter = code.charAt(code.length() - 1);

            double number = Double.parseDouble(code.replace(firstLetter, ' ') //" 12b"
                    .replace(lastLetter, ' ') //" 12 "
                    .trim()); //"12" -> 12


            if (Character.isUpperCase(firstLetter)){
                int positionUpperLetter = (int) firstLetter - 64;
                number /= positionUpperLetter;
            }else {
                int positionLowerCase = (int) firstLetter - 96;
                number *= positionLowerCase;
            }

            if (Character.isUpperCase(lastLetter)) {
                int positionUpperLetter = (int) lastLetter - 64;
                number -= positionUpperLetter;

            } else {
                int positionLowerCase = (int) lastLetter - 96;
                number += positionLowerCase;
            }
            totalSum += number;

        }
        System.out.printf("%.2f", totalSum);
    }
}
