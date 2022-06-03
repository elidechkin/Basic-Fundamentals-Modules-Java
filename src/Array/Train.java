package Array;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int[] wagons = new int[num];

        int sum = 0;

        for (int i = 0; i < wagons.length; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            sum += people;
            System.out.printf("%d ", people);

        }
        System.out.println();
        System.out.println(sum);

    }
}
