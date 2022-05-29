package Training;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profit = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double order = 0;
        double price = 0;



        while (!input.equals("Party!")){
            int coktail = input.length();
            int count = Integer.parseInt(scanner.nextLine());
            order = count * coktail;

            if (order % 2 != 0){
                order = order - (order * 0.25);
            }
            price += order;

            if (price >= profit){
                System.out.println("Target acquired.");
                break;
            }
            input = scanner.nextLine();

            }
        if (input.equals("Party!")){
            System.out.printf("We need %.2f leva more.%n", profit - price);

        }
        System.out.printf("Club income - %.2f leva.", price);

    }
}
