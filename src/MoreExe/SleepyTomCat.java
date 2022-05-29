package MoreExe;

import java.nio.charset.CodingErrorAction;
import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holydays = Integer.parseInt(scanner.nextLine());

        int workDay = 365 - holydays;
        int realTime = holydays * 127 + workDay * 63;
        int norma = Math.abs(30000 - realTime);
        double hour = norma / 60;
        double min = norma % 60;

        if (realTime > 30000){
            System.out.println("Tom will run away");
            System.out.printf(" %.0f hours and %.0f minutes more for play", hour, min);

        }else {
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", hour, min);
        }


    }
}
