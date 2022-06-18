package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        List<String> guessList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            List<String> inputLine = Arrays.stream(input.split(" "))
                    .collect(Collectors.toList());
            String nameGuess = inputLine.get(0);

            if (inputLine.size() == 3) {
                if (guessList.contains(nameGuess)) {
                    System.out.printf("%s is already in the list!%n", nameGuess);
                } else {
                    guessList.add(nameGuess);
                }


            } else if (inputLine.size() == 4) {
                if (guessList.contains(nameGuess)) {
                    guessList.remove(nameGuess);

                } else {
                    System.out.printf("%s is not in the list!%n", nameGuess);
                }

            }

        }
        for (String name : guessList) {
            System.out.println(name);

        }
    }
}
