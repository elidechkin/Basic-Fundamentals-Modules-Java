package TrainingFundamentals;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudents = Integer.parseInt(scanner.nextLine());
        int numOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        int maxAttendance = 0;

        for (int i = 0; i < numOfStudents; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());

            double totalBonus = Math.ceil(attendance * 1.00 / numOfLectures * (5 + additionalBonus));

            if (maxBonus <= totalBonus){
                maxBonus = totalBonus;
                maxAttendance = attendance;
            }

        }

        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", maxAttendance);

    }
}
