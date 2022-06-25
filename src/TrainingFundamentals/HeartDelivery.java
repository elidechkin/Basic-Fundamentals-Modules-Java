package TrainingFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> neighborhood = Arrays.stream(scanner.nextLine().split("@")).
                map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        int position = 0;
        int failed = 0;
        while (!command.equals("Love!")) {
            String[] commandline = command.split(" ");

            switch (commandline[0]) {
                case "Jump":
                    int jumpIndex = Integer.parseInt(commandline[1]);
                    position += jumpIndex;

                    if (position >= neighborhood.size()) {
                        position = 0;

                    }

                    if (neighborhood.get(position) == 0) {
                        System.out.printf("Place %d already had Valentine's day.\n", position);
                        break;
                    }

                    neighborhood.set(position, neighborhood.get(position) - 2);

                    if (neighborhood.get(position) == 0) {
                        failed++;
                        System.out.printf("Place %d has Valentine's day.\n", position);
                        break;
                    }

            }
            command = scanner.nextLine();
        }

        if (neighborhood.size() != failed) {
            System.out.printf("Cupid's last position was %d.\n", position);
            System.out.printf("Cupid has failed %d places.", neighborhood.size() - failed);
        } else {
            System.out.printf("Cupid's last position was %d.\n", position);
            System.out.println("Mission was successful.");
        }
    }
}

