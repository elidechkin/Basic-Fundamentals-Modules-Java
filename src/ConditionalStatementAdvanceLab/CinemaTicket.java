package ConditionalStatementAdvanceLab;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int price = 0;

        switch ( day){
            case "Monday":
                price = 12;
                break;
            case "Tuesday":
                price = 12;
                break;
            case "Wednesday":
                price = 14;
                break;
            case "Thursday":
                price = 14;
                break;
            case "Friday":
                price = 12;
                break;
            case "Saturday":
                price = 16;
                break;
            case "Sunday":
                price = 16;
                break;
            default:
                break;
        }
        System.out.println(price);

    }
}
