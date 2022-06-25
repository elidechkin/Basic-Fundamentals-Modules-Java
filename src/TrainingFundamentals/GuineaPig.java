package TrainingFundamentals;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFood = Double.parseDouble(scanner.nextLine());
        double quantityHay = Double.parseDouble(scanner.nextLine());
        double quantityCover = Double.parseDouble(scanner.nextLine());
        double pigWeight = Double.parseDouble(scanner.nextLine());

        double quantityFoodInGr = quantityFood * 1000;
        double quantityHayInGr = quantityHay * 1000;
        double quantityCoverInGr = quantityCover * 1000;
        double pigWeightinGr = pigWeight * 1000;

        for (int i = 1; i <= 30; i++) {
            quantityFoodInGr -= 300;
            if (i % 2 == 0){
                quantityHayInGr -=(quantityFoodInGr * 0.05);
            }
            if ( i % 3 == 0){
                quantityCoverInGr -= pigWeightinGr / 3;
            }

        }
        if (quantityFoodInGr > 0 && quantityHayInGr > 0 && quantityCoverInGr > 0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f."
            , quantityFoodInGr / 1000, quantityHayInGr / 1000, quantityCoverInGr / 1000);
        }else {
            System.out.print("Merry must go to the pet store!");
        }


    }
}
