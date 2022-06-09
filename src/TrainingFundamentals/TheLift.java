package TrainingFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int leftPeople = people;
        int countPeople = 0;

        for (int currentWagon : wagons) {
            if (currentWagon == 0) {
                countPeople = 4;
                leftPeople -= 4;
            }else {
                countPeople = 4 - currentWagon;
                leftPeople -= countPeople;
            }

        }
        if (leftPeople == 0){
            System.out.println("The lift has empty spots!");
            System.out.print(wagons + " ");
        } else if (leftPeople > 0){
            System.out.printf("There isn't enough space! %d people in a queue!%n", leftPeople);
            System.out.print(wagons + " ");
        }else{
            System.out.print(wagons + " ");
        }


    }
}
