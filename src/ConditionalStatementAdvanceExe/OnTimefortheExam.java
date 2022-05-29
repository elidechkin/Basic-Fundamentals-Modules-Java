package ConditionalStatementAdvanceExe;

import java.util.Scanner;

public class OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minArrival = Integer.parseInt(scanner.nextLine());

        int examAllMin = hourExam * 60 + minExam;
        int arrivalMin = hourArrival * 60 + minArrival;
        int diff = Math.abs(examAllMin - arrivalMin);
        int hour = diff / 60;
        int min = diff % 60;


        if (examAllMin < arrivalMin){
            System.out.println("Late");
            if ( diff <= 59){
                System.out.printf("%d minutes after the start", diff);
            }else {
                System.out.printf("%d:%02d hours after the start", hour, min);
            }

        }else if (examAllMin == arrivalMin || diff <= 30)  {
            System.out.println("On time");
            if (diff != 0);
            System.out.printf("%d minutes before the start", diff);

        }else if (arrivalMin >30){
            System.out.println("Early");
            if (diff <= 59){
                System.out.printf("%d minutes before the start", diff);
            }else {
                System.out.printf("%d:%02d hours before the start", hour, min);
            }
        }
    }
}
