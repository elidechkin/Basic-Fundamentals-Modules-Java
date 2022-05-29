package Training;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceBag20 = Double.parseDouble(scanner.nextLine());
        double weightBags = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int countBags = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (weightBags < 10){
            price += priceBag20 * 0.20;
        }else if (weightBags >=10 && weightBags <= 20){
            price += priceBag20 * 0.50;
        }else if (weightBags > 20){
            price += priceBag20 ;
        }

        if (days > 30){
            price += price * 0.10;
        }else if (days >= 7 && days <= 30){
            price += price * 0.15;
        }else {
            price += price * 0.40;
        }
        price *= countBags;

        System.out.printf("The total price of bags is: %.2f lv.", price);

    }
}
