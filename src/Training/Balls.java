package Training;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int totalPoint =0;
        int redCount =0;
        int orangCount =0;
        int yellowCount =0;
        int whiteCount =0;
        int otherCount =0;
        double divides =0;
        int point = 0;


        for (int i = 0; i < n ; i++) {
            String color = scanner.nextLine();

            if ("red".equals(color)) {
                point = 5;
                totalPoint += point;
                redCount++;
            } else if ("orange".equals(color)) {
                point = 10;
                totalPoint += point;
                orangCount++;
            } else if ("yellow".equals(color)) {
                point = 15;
                totalPoint += point;
                yellowCount++;
            } else if ("white".equals(color)) {
                point = 20;
                totalPoint += point;
                whiteCount++;
            } else if ("black".equals(color)) {
                totalPoint /= 2;
                divides++;
            }else {
                otherCount ++;
            }
        }
        System.out.printf("Total points: %d%n", totalPoint);
        System.out.printf("Red balls: %d%n", redCount);
        System.out.printf("Orange balls: %d%n", orangCount);
        System.out.printf("Yellow balls: %d%n", yellowCount);
        System.out.printf("White balls: %d%n", whiteCount);
        System.out.printf("Other colors picked: %d%n", otherCount);
        System.out.printf("Divides from black balls: %.0f%n", Math.floor(divides));

    }
}
