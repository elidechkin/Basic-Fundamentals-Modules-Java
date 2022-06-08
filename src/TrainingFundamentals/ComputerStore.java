package TrainingFundamentals;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double priceWithOutTax = 0;
        double priceWithTax = 0;
        double taxes = 0;


        while (!input.equals("special") && !input.equals("regular")){
            double price = Double.parseDouble(input);

            if (price <= 0){
                System.out.println("Invalid price!");
                input = scanner.nextLine();
               continue;
            }
            priceWithOutTax += price;

            input = scanner.nextLine();
        }

        taxes = priceWithOutTax * 0.20;
        priceWithTax = priceWithOutTax + taxes;


        if (input.equals("special")){
            priceWithTax= priceWithTax- (priceWithTax * 0.10);
        }
        if (priceWithTax == 0){
            System.out.println("Invalid order!");
        }else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",priceWithOutTax);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", priceWithTax);
        }

    }
}
