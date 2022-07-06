package exam;

import java.util.Scanner;

    public class BestPlayer_05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            int maxGoals = 0;
            String bestPlayer = "";
            boolean isBestPlayer = false;

            while (!input.equals("END")) {
                int goals = Integer.parseInt(scanner.nextLine());
                if (maxGoals < goals) {
                    maxGoals = goals;
                    bestPlayer = input;
                    isBestPlayer = true;
                }
                if (goals > 9) {
                    break;
                }

                input = scanner.nextLine();
            }
            System.out.printf("%s is the best player!%n", bestPlayer);

            if (isBestPlayer && maxGoals >= 3) {
                System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
            } else {
                System.out.printf("He has scored %d goals.", maxGoals);
            }
        }
    }


