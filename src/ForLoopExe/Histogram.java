package ForLoopExe;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                p1 ++;
            } else if (number <= 399) {
                p2 ++;
            } else if (number <= 599) {
                p3 ++;
            } else if (number <=799) {
                p4 ++;
            }else if ( number >= 800){
                p5 ++;
            }

        }

        double percP1 = p1 / n * 100;
        double percP2 = p2 / n * 100;
        double percP3 = p3 / n * 100;
        double percP4 = p4 / n * 100;
        double percP5 = p5 / n * 100;

        System.out.printf("%.2f%%%n", percP1);
        System.out.printf("%.2f%%%n", percP2);
        System.out.printf("%.2f%%%n", percP3);
        System.out.printf("%.2f%%%n", percP4);
        System.out.printf("%.2f%%%n", percP5);



    }
}
