package MoreExe;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String friut = scanner.nextLine();
        String size = scanner.nextLine();
        int order = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        switch (friut){
            case "Watermelon":
                if (size.equals("small")){
                    totalSum = order * 56 * 2;
                }else {
                    totalSum = order * 28.70 * 5;
                }
                break;
            case "Mango":
                if (size.equals("small")){
                    totalSum = order * 36.66 * 2;
                }else {
                    totalSum = order * 19.60 * 5;
                }
                break;
            case "Pineapple":
                if (size.equals("small")){
                    totalSum = order * 42.10 * 2;
                }else {
                    totalSum = order * 24.80 * 5;
                }
                break;
            case "Raspberry":
                if (size.equals("small")){
                    totalSum = order * 20 * 2;
                }else {
                    totalSum = order * 15.20 * 5;
                }
                break;
        }
        if (totalSum >= 400 && totalSum <= 1000){
            totalSum = totalSum - (totalSum * 0.15);
        }else if (totalSum > 1000){
            totalSum = totalSum - (totalSum * 0.50);
        }
        System.out.printf("%.2f lv.", totalSum);
    }
}
