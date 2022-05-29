package MoreExe;

import java.io.PrintStream;
import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wightCentimeters = w * 100.00;
        double lengthCentimeters = (h * 100.00) - 100.00;

        double weght = Math.floor(wightCentimeters / 120);

        double higt = Math.floor(lengthCentimeters / 70);

        double seats = (weght * higt) - 3;

        System.out.println(seats);


    }
}
