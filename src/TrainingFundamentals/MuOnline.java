package TrainingFundamentals;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dungeonRooms = scanner.nextLine().split("\\|");

        int health = 100;
        int bitcoins = 0;
        boolean isDeath = false;

        for (int i = 0; i < dungeonRooms.length; i++) {
            String[] arrElements = dungeonRooms[i].split(" ");
            String command = arrElements[0];
            int number = Integer.parseInt(arrElements[1]);



            switch (command){
                case "potion":
                    int diff = 100 - health;
                    health = health + number;
                    if (health > 100) {
                        number = diff;
                        health = 100;
                    }
                    System.out.printf("You healed for %d hp.%n",number);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    System.out.printf("You found %d bitcoins.%n", number);
                    bitcoins += number;
                    break;
                default:
                    health-= number;
                    if (health > 0){
                        System.out.printf("You slayed %s.%n", command);
                    }else{
                        isDeath = true;
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d", i +1);
                    }
                    break;
            }
            if (isDeath){
                break;
            }

        }
        if (!isDeath){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }
    }
}
