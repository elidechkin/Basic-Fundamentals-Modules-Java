package DataTypeVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int tankCapacity = 255;
        int sumOfLiters = 0;

        for (int i = 0; i < n; i++) {
            int entryLiters = Integer.parseInt(scanner.nextLine());
            sumOfLiters += entryLiters;

            if (sumOfLiters > tankCapacity){
                sumOfLiters -= entryLiters;
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(sumOfLiters);
    }
}
