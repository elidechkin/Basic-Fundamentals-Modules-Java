package ConditionalStatementAdvanceLab;

import java.util.Scanner;

public class WorkingDayWeekend {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);

        String day = scannner.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;

        }
    }
}
