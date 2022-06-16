package TrainingFundamentals;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int winBattle = 0;

        while (!input.equals("End of battle")){
            int distance = Integer.parseInt(input);

            energy-= distance;
            winBattle ++;

            if (energy < distance){
                System.out.printf("Not enough energy! Game ends with %d won battles and 0 energy", winBattle);
                break;
            }

            if (winBattle % 3 == 0){
                energy += winBattle;
            }

            input = scanner.nextLine();
        }
        if (energy > 0){
            System.out.printf("Won battles: %d. Energy left: %d", winBattle, energy);
        }

    }
}
