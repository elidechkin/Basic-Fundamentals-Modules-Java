package Training;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        double entry = Double.parseDouble(scanner.nextLine());
        double chair = Double.parseDouble(scanner.nextLine());
        double umbrella = Double.parseDouble(scanner.nextLine());

        double totalPriceEntry = countPeople * entry;
        double totalPriceUmbrella = Math.ceil(countPeople * 0.5) * umbrella;
        double totalPriceChair = Math.ceil(countPeople * 0.75) * chair;
        double total = totalPriceChair + totalPriceEntry + totalPriceUmbrella;

        System.out.printf("%.2f lv.", total);
    }
}
