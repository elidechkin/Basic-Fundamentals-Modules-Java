package ConditionalStatementsExe;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String nameSer = scanner.nextLine();
         int durationEpizode = Integer.parseInt(scanner.nextLine());
         int durationBreak = Integer.parseInt(scanner.nextLine());

        double lunch = durationBreak / 8.00;
        double rest =  durationBreak / 4.00;

        double leftTime = durationBreak - (lunch + rest);

        if (leftTime >= durationEpizode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameSer,
                    Math.ceil(leftTime - durationEpizode));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameSer,
                    Math.ceil(durationEpizode - leftTime));
        }



    }
}
