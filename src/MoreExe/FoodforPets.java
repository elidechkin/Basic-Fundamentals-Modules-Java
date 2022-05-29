package MoreExe;

import java.util.Scanner;

public class FoodforPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfDays = Integer.parseInt(scanner.nextLine());
        double amountFood = Double.parseDouble(scanner.nextLine());
        double totalFood = 0;
        double biscuit = 0;
        int dogFood = 0;
        int catFood = 0;


        for (int i = 1; i <= numOfDays ; i++) {
            int foodDog = Integer.parseInt(scanner.nextLine());
            int foodCat = Integer.parseInt(scanner.nextLine());
            totalFood += foodDog + foodCat;
            dogFood += foodDog;
            catFood += foodCat;

            if (i % 3 == 0) {
                biscuit += (foodDog + foodCat) * 0.10 ;

            }

        }
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuit));
        System.out.printf("%.2f%% of the food has been eaten.%n",totalFood  / amountFood * 100 );
        System.out.printf("%.2f%% eaten from the dog.%n", dogFood / totalFood * 100);
        System.out.printf("%.2f%% eaten from the cat.", catFood / totalFood   * 100);


    }
}

