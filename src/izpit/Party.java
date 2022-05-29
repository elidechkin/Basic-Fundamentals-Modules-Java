package izpit;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double party = Double.parseDouble(scanner.nextLine());
        int loveMessages = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keys = Integer.parseInt(scanner.nextLine());
        int pictures = Integer.parseInt(scanner.nextLine());
        int lucky = Integer.parseInt(scanner.nextLine());

        double totalPrice = loveMessages * 0.60 + roses * 7.20 + keys * 3.60 + pictures * 18.20 + lucky * 22;

        double countArticle = loveMessages + roses + keys + pictures + lucky;

        if ( countArticle >= 25){
            totalPrice = totalPrice - (totalPrice * 0.35);
        }
        double priceWithOutCost = totalPrice - (totalPrice * 0.10);

        if (priceWithOutCost >= party){
            System.out.printf("Yes! %.2f lv left.", priceWithOutCost - party );
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", party - priceWithOutCost );
        }
    }
}
