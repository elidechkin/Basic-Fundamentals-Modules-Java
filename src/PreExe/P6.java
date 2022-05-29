package PreExe;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceCpuDollars = Double.parseDouble(scanner.nextLine());
        double priceVideoCardDollars = Double.parseDouble(scanner.nextLine());
        double priceRamDollars = Double.parseDouble(scanner.nextLine());
        int countRam = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double priceCpuLv = priceCpuDollars * 1.57;
        double priceVideoLv = priceVideoCardDollars * 1.57;
        double priceRamLv = priceRamDollars * countRam * 1.57;

        double priceCpuPercent = priceCpuLv - ( priceCpuLv * percent);
        double priceVideoPercent = priceVideoLv - (priceVideoLv * percent);

        double totalMoney = priceCpuPercent + priceVideoPercent + priceRamLv;



        System.out.printf("Money needed - %.2f leva.", totalMoney);

    }
}
