package Training;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameCompany = scanner.nextLine();
        int countTicketAdult = Integer.parseInt(scanner.nextLine());
        int countTicketChild = Integer.parseInt(scanner.nextLine());
        double netPriceAdult = Double.parseDouble(scanner.nextLine());
        double task = Double.parseDouble(scanner.nextLine());

        double netPriceChild = netPriceAdult - (netPriceAdult * 0.70);
        double totalPriceAdult = netPriceAdult + task;
        double totalPriceChild = netPriceChild + task;
        double priceAll = (countTicketAdult * totalPriceAdult) + (countTicketChild * totalPriceChild);

        double profit = priceAll * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", nameCompany, profit);
    }
}
