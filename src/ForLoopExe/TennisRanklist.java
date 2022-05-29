package ForLoopExe;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());
        int startPoint = Integer.parseInt(scanner.nextLine());


        double win = 0;
        int point = 0;

        for (int i = 1; i <= games; i++) {
            String type = scanner.nextLine();
            switch (type){
                case "W":
                    point += 2000;
                    win ++;
                    break;
                case "F":
                    point += 1200;
                    break;
                case "SF":
                    point += 720;
                    break;
            }

        }
        System.out.printf("Final points: %d%n", startPoint + point);
        System.out.printf("Average points: %d%n", point / games);
        System.out.printf("%.2f%%", win / games * 100);


    }
}
