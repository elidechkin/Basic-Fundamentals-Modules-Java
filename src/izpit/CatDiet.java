package izpit;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fatPercent = Double.parseDouble(scanner.nextLine());
        double proteinPercent = Double.parseDouble(scanner.nextLine());
        double carbohidratesPercent = Double.parseDouble(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int water = Integer.parseInt(scanner.nextLine());


        double totalFat =totalCalories * fatPercent/ 100 / 9;
        double totalProtein = totalCalories  * proteinPercent /100 /4;
        double totalCarbohidrates = totalCalories * carbohidratesPercent / 100 / 4;
         double weithFood = totalFat + totalProtein + totalCarbohidrates;
         double caloriesPerGram = totalCalories / weithFood;
         double foodWithOutWater = caloriesPerGram - (caloriesPerGram * water / 100);

        System.out.printf("%.4f", foodWithOutWater);
    }
}
