package MoreExe;

import java.util.Scanner;

import static java.lang.Math.*;

public class LabNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());


        double rows = floor((w - 1) / 0.7);
        double cols = floor(l / 1.2);

        double seats = (rows * cols) - 3;

        System.out.println(seats);

    }

}
