package ExeOficial;

import java.util.Scanner;

public class Mine2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int location = Integer.parseInt(scanner.nextLine());
        double gold = 0;



        for (int i = 0; i < location ; i++) {
            double expectedGold = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double totalGold = 0;
            for (int j = 0; j < days; j++) {
                gold = Integer.parseInt(scanner.nextLine());
                totalGold += gold;

            }
            double average = totalGold / days;

            if (average >= expectedGold){
                System.out.printf("Good job! Average gold per day: %.2f.%n", average);
            }else {
                System.out.printf("You need %.2f gold.%n", expectedGold - average);
            }



        }
    }
}
