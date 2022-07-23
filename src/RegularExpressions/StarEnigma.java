package RegularExpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        StringBuilder sb = new StringBuilder();
        List<String> attack = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();
        int countAttack = 0;
        int countDestroyed = 0;

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            for (int j = 0; j < input.length(); j++) {
                char current = input.charAt(j);
                boolean small = current == 's' || current == 't' || current == 'a' || current == 'r';
                boolean big = current == 'S' || current == 'T' || current == 'A' || current == 'R';
                if (small || big) {
                    count++;
                }
            }
            for (int j = 0; j < input.length(); j++) {
                char current = input.charAt(j);
                char current1 = (char) (current - count);
                sb.append(current1);


            }
            String regex = ".*@(?<name>[A-Za-z]+)[^@:!\\->]*:(?<population>\\d+)[^@:!\\->]*!(?<command>[A|D])![^@:!\\->]*\\->(?<soldier>\\d+).*";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(sb);
            if (matcher.matches()) {
                String name = matcher.group("name");
                int population = Integer.parseInt(matcher.group("population"));
                String attackString = matcher.group("command");
                int soldier = Integer.parseInt(matcher.group("soldier"));


                if ("A".equals(attackString)) {
                    attack.add(name);
                    countAttack++;
                } else {
                    destroyed.add(name);
                    countDestroyed++;
                }

            }
            sb.setLength(0);
            count = 0;

        }

        attack.sort(Comparator.naturalOrder());
        destroyed.sort(Comparator.naturalOrder());

        if (countAttack == 0) {
            System.out.println("Attacked planets: 0");
        } else {
            System.out.printf("Attacked planets: %d%n", countAttack);
            for (String planet : attack) {
                System.out.printf("-> %s%n", planet);
            }
        }
        if (countDestroyed == 0) {
            System.out.println("Destroyed planets: 0");
        } else {
            System.out.printf("Destroyed planets: %d%n", countDestroyed);
            for (String planet : destroyed) {
                System.out.printf("-> %s%n", planet);
            }
        }
    }
}
