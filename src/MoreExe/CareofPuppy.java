package MoreExe;

import java.util.Scanner;

public class CareofPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bougthFood = Integer.parseInt(scanner.nextLine());
        bougthFood *= 1000;

        String input = scanner.nextLine();
        int totalEatenFood = 0;

        while (!input.equals("Adopted")){
            int dayFood = Integer.parseInt(input);
            totalEatenFood += dayFood;

            input = scanner.nextLine();

        }
        if (bougthFood >= totalEatenFood){
            System.out.printf("Food is enough! Leftovers: %d grams.", bougthFood - totalEatenFood);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", totalEatenFood - bougthFood);
        }




    }
}
