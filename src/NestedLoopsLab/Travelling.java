package NestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();



        while (!destination.equals("End")){
            double budget = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum < budget){
                double saved = Double.parseDouble(scanner.nextLine());
                sum += saved;

            }
            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();

        }

    }
}
