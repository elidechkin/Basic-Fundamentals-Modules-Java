package Training;

import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mostPowerfulWord = "";
        double maxPower = 0;

        String input = "";
        while (!"End of words".equals(input = scanner.nextLine())) {
            double inputSum = 0;
            for (int i = 0; i < input.length(); i++) {
                inputSum += input.charAt(i);
            }

            int numLength = input.length();
            String firstLetter = input.toLowerCase();
            if (firstLetter.charAt(0) == 'a'
                    || firstLetter.charAt(0) == 'e'
                    || firstLetter.charAt(0) == 'i'
                    || firstLetter.charAt(0) == 'o'
                    || firstLetter.charAt(0) == 'u'
                    || firstLetter.charAt(0) == 'y') {
                inputSum = inputSum * numLength;
            } else {
                inputSum = Math.floor(inputSum / numLength);
            }


            if (inputSum > maxPower) {
                maxPower = inputSum;
                mostPowerfulWord = input;
            }
        }

        System.out.println(String.format("The most powerful word is %s - %.0f", mostPowerfulWord, maxPower));

    }
}
