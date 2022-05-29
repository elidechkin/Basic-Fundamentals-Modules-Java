package ExeOficial;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bouthFood = Integer.parseInt(scanner.nextLine());
        int foodPerGrams = bouthFood * 1000;
        String input = scanner.nextLine();

        int totalEatedFood = 0;

        while (!input.equals("Adopted")){
            int eatedFood= Integer.parseInt(input);

            totalEatedFood += eatedFood;
            input = scanner.nextLine();
        }

        if (foodPerGrams >= totalEatedFood){
            System.out.printf("Food is enough! Leftovers: %d grams.", foodPerGrams - totalEatedFood);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(foodPerGrams - totalEatedFood));
        }
    }
}
