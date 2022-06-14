package TrainingFundamentals;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmpl = Integer.parseInt(scanner.nextLine());
        int secondEmpl = Integer.parseInt(scanner.nextLine());
        int thirthEmpl = Integer.parseInt(scanner.nextLine());
        int allStudents = Integer.parseInt(scanner.nextLine());

        int threeInAnHour = firstEmpl + secondEmpl + thirthEmpl;

        int hour = 0;

        while (allStudents > 0){
            allStudents -= threeInAnHour;
            hour ++;

            if (hour % 4 == 0){
                hour ++;
            }

        }
        System.out.printf("Time needed: %dh.", hour);
    }
}
