package MoreExe;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalkDay = Integer.parseInt(scanner.nextLine());
        int countWalkDay = Integer.parseInt(scanner.nextLine());
        int caloriesDay = Integer.parseInt(scanner.nextLine());

        int amountMinutes = minutesWalkDay * countWalkDay;
        int burnedCalories = amountMinutes * 5;
        int halfCalories = caloriesDay * 50 / 100;

        if (burnedCalories >= halfCalories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }

    }
}
