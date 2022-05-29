package ExeOficial;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cat = Integer.parseInt(scanner.nextLine());
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        double totalFood = 0;

        for (int i = 1; i <= cat ; i++) {
            double foodPerCat = Double.parseDouble(scanner.nextLine());

            if (foodPerCat >= 100 && foodPerCat < 200){
                group1 ++;
                totalFood += foodPerCat;

            }else if (foodPerCat >= 200 && foodPerCat < 300){
                group2 ++;
                totalFood += foodPerCat;

            }else if (foodPerCat >= 300 && foodPerCat < 400){
                group3 ++;
                totalFood += foodPerCat;

            }

        }
        double foodPrice = totalFood / 1000 * 12.45;

        System.out.printf("Group 1: %d cats.%n", group1);
        System.out.printf("Group 2: %d cats.%n", group2);
        System.out.printf("Group 3: %d cats.%n", group3);
        System.out.printf("Price for food per day: %.2f lv.",foodPrice);
    }
}
