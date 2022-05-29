package FirstStepInCoding.lab;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        //Общо време за четене на книгата: 212 страници / 20 страници за час = 10 часа общо
        //Необходимите часове на ден: 10 часа / 2 дни = 5 часа на ден

        int allHours = pages / pagesPerHour;
        int hoursForReading = allHours / days;

        System.out.println(hoursForReading);

    }
}
