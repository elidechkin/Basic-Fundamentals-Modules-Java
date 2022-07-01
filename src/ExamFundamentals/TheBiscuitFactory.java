package ExamFundamentals;

import java.util.Scanner;

public class TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPerDay = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int competingFactory = Integer.parseInt(scanner.nextLine());

        int biscuitPerDay = countPerDay * workers;
        int totalBiskuit = 0;

        for (int i = 1; i < 30 +1; i++) {
            if (i % 3 == 0){
                totalBiskuit += Math.floor(biscuitPerDay * 0.75);
                continue;
            }
            totalBiskuit += biscuitPerDay;



        }
        System.out.printf("You have produced %d biscuits for the past month.%n", totalBiskuit);
        double diff = (totalBiskuit - competingFactory) * 1.00 / competingFactory  * 100;
        if (totalBiskuit> competingFactory){
            System.out.printf("You produce %.2f percent more biscuits.", diff);
        }else {
            System.out.printf("You produce %.2f percent less biscuits.", Math.abs(diff));
        }
    }
}
