package exam;

import java.util.Scanner;

public class CalculatorTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;


        if (countPeople <= 5){
            switch (season){
                case "spring":
                    price = countPeople * 50.00;
                    break;
                case "summer":
                    price = countPeople * 48.50;
                    price = price - (price * 0.15);
                    break;
                case "autumn":
                    price = countPeople * 60.00;
                    break;
                case "winter":
                    price = countPeople * 86.00;
                    price = price + (price * 0.08);
                    break;
            }
        }else {
            switch (season){
                case "spring":
                    price = countPeople * 48.00;
                    break;
                case "summer":
                    price = countPeople * 45.00;
                    price = price - (price * 0.15);
                    break;
                case "autumn":
                    price = countPeople * 49.50;
                    break;
                case "winter":
                    price = countPeople * 85.00;
                    price = price + (price * 0.08);
                    break;
            }

        }
        System.out.printf("%.2f leva", price);

    }
}
