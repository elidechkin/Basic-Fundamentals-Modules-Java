package Training;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int night = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (night > 7){
            pricePerNight = pricePerNight - (pricePerNight * 0.05);
        }
        price = (night * pricePerNight) + (budget * percent / 100);

        if (budget >= price){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - price);
        }else {
            System.out.printf("%.2f leva needed.", price - budget);
        }
    }
}
