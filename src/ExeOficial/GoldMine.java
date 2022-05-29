package ExeOficial;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int location = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < location; i++) {
            double avrExtraction = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double sumExtraction = 0.0;
            for (int j = 0; j < days; j++) {
                double extraction = Double.parseDouble(scanner.nextLine());
                sumExtraction += extraction;
            }
            double average = sumExtraction /days;
            if(average >= avrExtraction) {
                System.out.printf("Good job! Average gold per day: %.2f.%n",average);
            }else {
                System.out.printf("You need %.2f gold.%n", avrExtraction - average);
            }
        }
    }
}
