package ConditionalStatementsExe;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secPerMeter = Double.parseDouble(scanner.nextLine());

        double resistence = Math.floor( distance / 15 ) * 12.5;
        double ivantime = distance * secPerMeter + resistence;

        if (ivantime < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivantime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", ivantime - worldRecord);
        }
    }
}
