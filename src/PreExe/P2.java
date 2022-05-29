package PreExe;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tshirt = Double.parseDouble(scanner.nextLine());
        double sum = Double.parseDouble(scanner.nextLine());

        double priceShort = tshirt * 0.75;
        double priceSocks =  priceShort * 0.20;
        double butonki =  (tshirt + priceShort) * 2;
        double totalPrice = tshirt + priceShort + priceSocks + butonki;
        double diskount = totalPrice - (totalPrice * 0.15);

        if (diskount >= sum){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", diskount);
        }else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", sum - diskount);
        }



    }
}
