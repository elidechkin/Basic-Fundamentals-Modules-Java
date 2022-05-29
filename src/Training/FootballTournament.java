package Training;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameTeam = scanner.nextLine();
        int played = Integer.parseInt(scanner.nextLine());

        double totalPoints = 0;
        double w = 0;
        int d = 0;
        int l = 0;


        for (int i = 1; i <= played; i++) {
            String result = scanner.nextLine();

            if (result.equals("W")){
                w ++;
                totalPoints += 3;
            }else if (result.equals("D")){
                d ++;
                totalPoints ++;
            }else if (result.equals("L")){
                l++;
            }

        }
        if (totalPoints == 0){
            System.out.printf("%s hasn't played any games during this season.",nameTeam);
        }else {
            System.out.printf("%s has won %.0f points during this season.%n", nameTeam, totalPoints);
            System.out.printf("Total stats:%n");
            System.out.printf("## W: %.0f%n", w);
            System.out.printf("## D: %d%n", d);
            System.out.printf("## L: %d%n", l);
            System.out.printf("Win rate: %.2f%%", w / played * 100);
        }


    }
}
