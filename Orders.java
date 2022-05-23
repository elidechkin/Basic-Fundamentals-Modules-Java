package BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countOrders = Integer.parseInt(scanner.nextLine());


        double pricePerOrder = 0;
        double totalPrice = 0;

        for (int i = 1; i <= countOrders ; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            pricePerOrder = pricePerCapsule * days * capsulesCount;
            totalPrice += pricePerOrder;

            System.out.printf("The price for the coffee is: $%.2f%n", pricePerOrder);

        }
        System.out.printf("Total: $%.2f", totalPrice);



    }
}
