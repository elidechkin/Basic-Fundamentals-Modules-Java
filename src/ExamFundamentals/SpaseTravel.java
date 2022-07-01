package ExamFundamentals;

import java.util.Scanner;

public class SpaseTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] travelTour = scanner.nextLine().split("\\|\\|");
        int startFuel = Integer.parseInt(scanner.nextLine());
        int startAmmunition = Integer.parseInt(scanner.nextLine());

        int currentFuel = startFuel;
        int currentAmmunition = startAmmunition;

        int i = 0;
        while (i < travelTour.length) {
            String[] commandLine = travelTour[i].split(" ");
            String command = commandLine[0];
            if (command.equals("Titan")){
                System.out.println("You have reached Titan, all passengers are safe.");
                break;
            }
            int index = Integer.parseInt(commandLine[1]);


            if ("Travel".equals(command)) {
                currentFuel--;
                if (currentFuel > index) {
                    System.out.printf("The spaceship travelled %d light-years.%n", index);
                } else {
                    System.out.println("Mission failed.");
                }
            } else if ("Enemy".equals(command)) {
                if (currentAmmunition >= index) {
                    currentAmmunition -= index;
                    System.out.printf("An enemy with %d armour is defeated.%n", index);
                } else if ((currentAmmunition < index)) {
                    currentFuel -= index * 2;
                    if (currentFuel > 0) {
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", index);
                    }else {
                        System.out.println("Mission failed.");
                        break;
                    }

                }
            } else if ("Repair".equals(command)) {
                currentFuel += index;
                currentAmmunition += index * 2;
                System.out.printf("Ammunitions added: %d.%n", index * 2);
                System.out.printf("Fuel added: %d.%n", index);
            }

            i++;
        }


    }
}
