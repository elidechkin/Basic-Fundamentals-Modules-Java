package ExeOficial;

import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double pagePrice = Double.parseDouble(scanner.nextLine());
        double koricaPrice = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double disain = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double pricePages = (pagePrice * 899) + (2 * koricaPrice);
        double paperDisc = pricePages - (pricePages * discount / 100);
        double disainPrice = paperDisc + disain;
        double team = disainPrice - ( disainPrice * percent /100);

        System.out.printf("Avtonom should pay %.2f BGN.", team);
    }
}
