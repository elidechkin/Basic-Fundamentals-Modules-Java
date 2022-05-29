package Training;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        int max = 0;
        int goals = 0;
        String name = "";
        boolean best = false;

        while (!input.equals("END")){
            goals = Integer.parseInt(scanner.next());

            if (max < goals){
                max = goals;
                name = input;
                best = true;
            }

            if (goals > 9){
                break;
            }
            input = scanner.next();

        }
        System.out.printf("%s is the best player!%n", name);
        if (goals >= 3 && best){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", max);
        } else {
            System.out.printf("He has scored %d goals.", max);
        }


    }
}
