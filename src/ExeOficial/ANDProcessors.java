package ExeOficial;

import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countAmd = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int workDays = Integer.parseInt(scanner.nextLine());

        double workHours = workers * workDays * 8;
        double amd = Math.floor(workHours / 3);

        if (countAmd > amd){
            double loses = (countAmd - amd) * 110.10;
            System.out.printf("Losses: -> %.2f BGN", loses);
        } else {
            double profit = (amd - countAmd) * 110.10;
            System.out.printf("Profit: -> %.2f BGN", profit);
        }

    }
}
