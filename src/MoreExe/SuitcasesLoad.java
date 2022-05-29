package MoreExe;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trunkCapacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        int countSuitcases = 0;
        double suitcases = 0;


        while (!input.equals("End")){
            double volumeSuitcases = Double.parseDouble(input);
            suitcases += volumeSuitcases;
            countSuitcases ++;

            if (suitcases >= trunkCapacity){
                countSuitcases --;
                break;
            }

            if (countSuitcases % 3 == 0){
                suitcases += volumeSuitcases * 0.10;
            }
            input = scanner.nextLine();

        }
        if (input.equals("End")){
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", countSuitcases);
        }else {
            System.out.println("No more space!");
            System.out.printf("Statistic: %d suitcases loaded.", countSuitcases);
        }


    }
}
